package e.emjinter.vm.operations;

import e.emjinter.Grammar;
import e.emjinter.exception.EmjInterExceptionBase;
import e.emjinter.exception.InvalidParamException;
import e.emjinter.source.IStream;
import e.emjinter.vm.IVM;

public class MemoryReadCommand extends AbstractCommand {

  public MemoryReadCommand(IVM vm) {
    super(vm);
    
    emojiCode = Grammar.CMD_MEM_READ;
    numSymbols = 3;
  }

  @Override
  public void checkSyntax(IStream source) throws EmjInterExceptionBase {
    
    if(!variables.containsKey(source.checkNext(0)))
    {
      throw new InvalidParamException(String.format("Unexpected symbol at pos %s. Expected memory location didn't find one.", source.getPosition() + 1));
    }
    
    if(!registers.containsKey(source.checkNext()))
    {
      throw new InvalidParamException(String.format("Unexpected symbol at pos %s. Expected a register value but didn't find one.", source.getPosition() + 2));
    }
    
  }

  @Override
  public void execute(IStream source) throws EmjInterExceptionBase {
    checkSyntax(source);
    
    int val = variables.getValue(source.next());
    int regLoc = source.next();
    
    registers.updateValue(regLoc, val);
  }

}
