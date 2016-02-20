package e.emjinter.vm;

import java.util.*;

import e.emjinter.source.*;
import e.emjinter.exception.*;
import e.emjinter.vm.operations.*;

public class emjVM {

  private SourceStream source; 
  
  private Map<Integer, Integer> registers;
  private Map<Integer, Integer> variables;
  private Map<Integer, ICommand> operations;
  
  public emjVM(SourceStream source)
  {
    this.source = source;
    
    registers = new HashMap<Integer, Integer>();
    variables = new HashMap<Integer, Integer>();
    operations = new HashMap<Integer, ICommand>();
  }
  
  public void run()
  {
    while(source.getPosition() < source.getLength())
    {
      try 
      { 
        int cmdVal = source.next();
        ICommand cmd = operations.get(cmdVal);
        if(cmd == null) { throw new InvalidOperationException(cmdVal); }
        operations.get(source.next()).execute();
      }
      catch (EmjInterExceptionBase e) 
      { 
        System.err.println(e.getMessage());
        break;
      }
    }
  }
  

  
}
