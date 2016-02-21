package e.emjinter.vm.operations;

import e.emjinter.CodeToEmojiConverter;
import e.emjinter.Grammar;
import e.emjinter.exception.EmjInterExceptionBase;
import e.emjinter.exception.InvalidParamException;
import e.emjinter.source.IStream;
import e.emjinter.vm.IVM;

public class ModCommand extends AbstractCommand {

  public ModCommand(IVM vm)
  {
    super(vm);
    
    emojiCode = Grammar.CMD_MOD;
    numSymbols = 3;
  }
  
  @Override
  public void checkSyntax(IStream source) throws EmjInterExceptionBase {
    if(!registers.containsKey(source.checkNext(0)))
    {
      throw new InvalidParamException(String.format("Unexpected token at pos %s. Not a valid register value.",
          CodeToEmojiConverter.convert(source.getPosition())));
    }
    
    if(!registers.containsKey(source.checkNext(1)))
    {
      throw new InvalidParamException(String.format("Unexpected token at pos %s. Not a valid register value.",
          CodeToEmojiConverter.convert(source.getPosition())));
    }
  }

  @Override
  public void execute(IStream source) throws EmjInterExceptionBase {
    checkSyntax(source);
    
    int reg = source.next();
    int modReg = source.next();
    
    int oldVal = registers.getValue(reg);
    int modVal = registers.getValue(modReg);
    
    int newVal = oldVal % modVal;
    
    registers.updateValue(reg, newVal);
  }


}
