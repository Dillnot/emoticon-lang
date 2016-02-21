package e.emjinter.vm;

import java.io.*;
import java.util.*;

import e.emjinter.source.*;
import e.emjinter.exception.*;
import e.emjinter.vm.operations.*;

public class emjVM implements IVM {

  private SourceStream source; 
  
  private AbstractKVPStore<Integer, Integer> registers;
  private AbstractKVPStore<Integer, Integer> variables;
  private AbstractKVPStore<Integer, ICommand> operations;
  private Deque<AbstractKVPStore<Integer, Integer>> stack;
  
  public emjVM(SourceStream source)
  {
    this.source = source;
    registers = new RegisterStore();
    variables = new VariableStore();
    operations = new OperationStore(this);
    
    stack = new LinkedList<AbstractKVPStore<Integer, Integer>>();
    stack.push(registers);
    
    checkDirs();
  }
  
  public AbstractKVPStore<Integer, Integer> getRegisters() { return registers; }
  public AbstractKVPStore<Integer, Integer> getVariables() { return variables; }
  
  public void run() { doRun(source); }
  
  public void executeSubStream(IStream subStream) 
  { 
    //Stack frames :3
    stack.push(registers);
    //registers = new RegisterStore();
    
    doRun(subStream);
    
    registers = stack.pop();
  }
  
  private void doRun(IStream source)
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
        System.exit(-1);
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
