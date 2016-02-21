package e.emjinter.vm;

import java.io.*;

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
    
    checkDirs();
  }
  
  public void run()
  {
    while(source.getPosition() < source.getLength())
    {
      try 
      { 
        int cmdVal = source.next();
        ICommand cmd = operations.getValue(cmdVal);
        if(cmd == null) { throw new InvalidOperationException(cmdVal, source.getPosition()); }
        operations.getValue(cmdVal).execute(source);
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
    System.out.println(registers.print());
  }
  
  private void checkDirs()
  {
    File outDir = new File("output");
    if(!outDir.exists())
    {
      outDir.mkdir();
    }
  }

  
}
