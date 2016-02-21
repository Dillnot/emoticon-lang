package e.emjinter.vm.operations;

import e.emjinter.Grammar;
import e.emjinter.exception.EmjInterExceptionBase;
import e.emjinter.exception.InvalidParamException;
import e.emjinter.source.IStream;
import e.emjinter.source.SubStream;
import e.emjinter.vm.IVM;

public class WhileCommand extends AbstractCommand {

  public WhileCommand(IVM vm) {
    super(vm);
    
    emojiCode = Grammar.WHILE_START;
    numSymbols = -1;
  }

  @Override
  public void checkSyntax(IStream source) throws EmjInterExceptionBase {

    if (!registers.containsKey(source.checkNext()))
    {
      throw new InvalidParamException(String.format("Expected a register value at pos %s but didn't find one",  source.getPosition() + 1));
    }
    
    if(!variables.containsKey(source.checkNext(1)))
    {
      throw new InvalidParamException(String.format("Expected a memory value at pos %s but didn't find one.", source.getPosition() + 2));
    }
    
    for(int i = 2; i < source.getLength(); i++)
    {
      if(source.checkNext(i) == Grammar.WHILE_END) { return; }
    }
    
    throw new RuntimeException("Expected end ot loop but didn't find one.");

  }

  @Override
  public void execute(IStream source) throws EmjInterExceptionBase {
    
    checkSyntax(source);
    
    int refA = source.next();
    int refB = source.next();
    int a = registers.getValue(refA);
    int b = variables.getValue(refB);
    int[] whileBody = new int[65536];
    int i = 0;
    int cursor = 0;
    
    while(true)
    {
      cursor = source.next();
      if(cursor != Grammar.WHILE_END)
      {
        whileBody[i]= cursor;
        i++;
      }
      else { break; }
    }
    
    while(a != b)
    {
      vm.executeSubStream(new SubStream(whileBody));
      
      a = registers.getValue(refA);
      b = variables.getValue(refB);
    }
    
  }

}
