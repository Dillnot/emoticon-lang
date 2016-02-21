package e.emjinter.vm;

import e.emjinter.Grammar;
import e.emjinter.exception.RuntimeException;
import e.emjinter.vm.operations.*;

public class OperationStore extends AbstractKVPStore<Integer, ICommand> {

  public OperationStore(IVM vm)
  {
    super();
    
    addCommands(vm);
  }

  @Override
  public void addValue(Integer key, ICommand value) throws RuntimeException
  {
    throw new RuntimeException("CommandStore. User code attempting to add a command");
  }
  
  @Override
  public void updateValue(Integer key, ICommand newValue)
  {
    return;
    //We want to do nothing...
    //This should never be called
  }
  
  private void addCommands(IVM vm)
  {
    data.put(Grammar.CMD_ADD, new AddCommand(vm));
    data.put(Grammar.CMD_SUB, new SubCommand(vm));
    data.put(Grammar.CMD_PRNT_START, new PrintCommand(vm));
    data.put(Grammar.CMD_DUMP_START, new DumpCommand(vm));
  }

  
  
}
