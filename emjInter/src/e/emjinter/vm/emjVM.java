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
    operations = new OperationStore();
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
        operations.getValue(source.next()).execute();
      }
      catch (EmjInterExceptionBase e) 
      { 
        System.err.println(e.getMessage());
        break;
      }
    }
  }
  

  
}
