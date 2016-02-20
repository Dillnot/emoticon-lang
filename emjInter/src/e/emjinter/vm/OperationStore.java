package e.emjinter.vm;

import e.emjinter.Grammar;
import e.emjinter.exception.RuntimeException;
import e.emjinter.vm.operations.*;

public class OperationStore extends AbstractKVPStore<Integer, ICommand> {

  public OperationStore(AbstractKVPStore<Integer, Integer> registers, AbstractKVPStore<Integer, Integer> vairables)
  {
    super();
    
    addCommands(registers, vairables);
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
  
  private void addCommands(AbstractKVPStore<Integer, Integer> refRegisters, AbstractKVPStore<Integer, Integer> refVariables)
  {
    data.put(Grammar.CMD_ADD, new AddCommand(refRegisters, refVariables));
  }

  
  
}
