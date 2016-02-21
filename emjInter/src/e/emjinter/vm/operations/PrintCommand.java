package e.emjinter.vm.operations;

import e.emjinter.vm.*;
import e.emjinter.Grammar;
import e.emjinter.source.*;
import e.emjinter.exception.*;


public class PrintCommand extends AbstractCommand {
  
  public PrintCommand(IVM vm)
  {
    super(vm);

    emojiCode = Grammar.CMD_PRNT_START;
    numSymbols = -1;
  }

  @Override
  public void checkSyntax(IStream source) throws EmjInterExceptionBase {
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
  public void execute(IStream source) throws EmjInterExceptionBase {
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
