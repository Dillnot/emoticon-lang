package e.emjinter.vm.operations;

import e.emjinter.*;
import e.emjinter.vm.*;
import e.emjinter.source.*;
import e.emjinter.exception.*;


public class SubCommand extends AbstractCommand {

  public SubCommand(IVM vm)
  {
    super(vm);
    
    emojiCode = Grammar.CMD_SUB;
    numSymbols = 2;
  }
  
  @Override
  public void checkSyntax(IStream source) throws EmjInterExceptionBase {
    if(!registers.containsKey(source.checkNext()))
    {
      throw new InvalidParamException(String.format("Unexpected token at pos %s. Not a valid register value.",
          CodeToEmojiConverter.convert(source.getPosition() + 1)));
    }
  }

  @Override
  public void execute(IStream source) throws EmjInterExceptionBase {
    checkSyntax(source);
    
    int reg = source.next();
    int val = registers.getValue(reg);
    registers.updateValue(reg, ++val);
  }
}
