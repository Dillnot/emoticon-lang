package e.emjinter.vm;

import java.util.*;

import e.emjinter.source.*;
import e.emjinter.exception.*;
import e.emjinter.vm.operations.*;

public class emjVM {

  private SourceStream source; 
  
  private AbstractKVPStore<Integer, Integer> registers;
  private AbstractKVPStore<Integer, Integer> variables;
  private AbstractKVPStore<Integer, ICommand> operations;
  
  public emjVM(SourceStream source)
  {
    this.source = source;
    registers = new RegisterStore();
    variables = new VariableStore();
    operations = new OperationStore(registers, variables);
  }
  
  public void run()
  {
    while(source.getPosition() < source.getLength())
    {
      try 
      { 
        int cmdVal = source.next();
        ICommand cmd = operations.getValue(cmdVal);
        if(cmd == null) { throw new InvalidOperationException(cmdVal); }
        operations.getValue(source.next()).execute(source);
      }
      catch (EmjInterExceptionBase e) 
      { 
        System.err.println(e.getMessage());
        break;
      }
    }
  }
  
  
  public void debugShutdown()
  {
    System.out.println("Printing Reg Values");
    registers.print();
  }

  
}
