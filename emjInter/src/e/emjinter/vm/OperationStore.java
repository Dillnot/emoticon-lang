package e.emjinter.vm;

import e.emjinter.exception.RuntimeException;
import e.emjinter.vm.operations.*;

public class OperationStore extends AbstractKVPStore<Integer, ICommand> {

  public OperationStore()
  {
    super();
    
    addCommands();
  }

  @Override
  protected void addValue(Integer key, ICommand value) throws RuntimeException
  {
    throw new RuntimeException("CommandStore. User code attempting to add a command");
  }
  
  private void addCommands()
  {
    
  }
  
  
}
