package e.emjinter.vm.operations;

import e.emjinter.CodeToEmojiConverter;
import e.emjinter.Grammar;
import e.emjinter.exception.EmjInterExceptionBase;
import e.emjinter.exception.InvalidParamException;
import e.emjinter.source.SourceStream;
import e.emjinter.vm.AbstractKVPStore;

public class PrintCommand extends AbstractCommand {
  
  public PrintCommand(AbstractKVPStore<Integer, Integer> refRegisters, AbstractKVPStore<Integer, Integer> refVariables)
  {
    super(refRegisters, refVariables);

    emojiCode = Grammar.CMD_PRNT_START;
    numSymbols = -1;
  }

  @Override
  public void checkSyntax(SourceStream source) throws EmjInterExceptionBase {
    for(int i = 0; i < source.getLength(); i++)
    {
      int memLocation = source.checkNext(i);
      if(memLocation == Grammar.CMD_PRNT_END) { break; }
      
      if(!registers.containsKey(memLocation) && !variables.containsKey(memLocation))
      {
        throw new InvalidParamException(String.format("Unexpected token at pos %s. Not a valid register value or variable identifier.",
          source.getPosition() + i));
      } 
    }
  }

  @Override
  public void execute(SourceStream source) throws EmjInterExceptionBase {
    checkSyntax(source);
    
    for(int i = 0; i < source.getLength(); i++)
    {
      int memLocation = source.next();
      if(memLocation == Grammar.CMD_PRNT_END) { break ; }
      
      if(registers.containsKey(memLocation)) { System.out.print(registers.getValue(memLocation)); }
      else { System.out.print(variables.getValue(memLocation)); } 
    }
    
    System.out.print("\n");
  }

}
