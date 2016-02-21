package e.emjinter.vm.operations;

import e.emjinter.vm.*;
import e.emjinter.CodeToEmojiConverter;
import e.emjinter.Grammar;
import e.emjinter.source.*;
import e.emjinter.exception.*;

public class AddCommand extends AbstractCommand {

  public AddCommand(IVM vm)
  {
    super(vm);
    
    emojiCode = Grammar.CMD_ADD;
    numSymbols = 2;
  }
  
  @Override
  public void checkSyntax(IStream source) throws EmjInterExceptionBase {
    if(!registers.containsKey(source.checkNext(0)))
    {
      throw new InvalidParamException(String.format("Unexpected token at pos %s. Not a valid register value.",
          CodeToEmojiConverter.convert(source.getPosition())));
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
