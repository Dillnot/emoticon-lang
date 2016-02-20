package e.emjinter.vm.operations;

import e.emjinter.vm.*;
import e.emjinter.Grammar;
import e.emjinter.source.*;
import e.emjinter.exception.*;

public class AddCommand extends AbstractCommand {

  public AddCommand(AbstractKVPStore<Integer, Integer> registers, AbstractKVPStore<Integer, Integer> variables)
  {
    super(registers, variables);
    
    emojiCode = Grammar.CMD_ADD;
    numSymbols = 2;
  }
  
  @Override
  public void checkSyntax(SourceStream source) throws EmjInterExceptionBase {
    if(!registers.containsKey(source.checkNext()))
    {
      throw new InvalidParamException(String.format("Unexpected token at pos %s. Not a valid register value.", source.getPosition() + 1));
    }
  }

  @Override
  public void execute(SourceStream source) throws EmjInterExceptionBase {
    checkSyntax(source);
    
    int reg = source.next();
    int val = registers.getValue(reg);
    registers.updateValue(reg, ++val);
  }


}
