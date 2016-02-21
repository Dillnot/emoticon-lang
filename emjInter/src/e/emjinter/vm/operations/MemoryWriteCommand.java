package e.emjinter.vm.operations;

import e.emjinter.Grammar;
import e.emjinter.exception.EmjInterExceptionBase;
import e.emjinter.exception.InvalidParamException;
import e.emjinter.source.IStream;
import e.emjinter.vm.IVM;

public class MemoryWriteCommand extends AbstractCommand {

  public MemoryWriteCommand(IVM vm) {
    super(vm);

    emojiCode = Grammar.CMD_MEM_WRITE;
    numSymbols = 3;
  }

  @Override
  public void checkSyntax(IStream source) throws EmjInterExceptionBase {

    if(!registers.containsKey(source.checkNext(1)))
    {
      throw new InvalidParamException(String.format("Unexpected symbol at pos %s. Expected a register value but didn't find one.", source.getPosition() + 2));
    }
  }

  @Override
  public void execute(IStream source) throws EmjInterExceptionBase {
    checkSyntax(source);
    
    int memLoc = source.next();
    int val = registers.getValue(source.next());
    
    variables.addValue(memLoc, val);
  }

}
