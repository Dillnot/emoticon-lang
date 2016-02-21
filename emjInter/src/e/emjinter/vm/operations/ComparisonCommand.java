package e.emjinter.vm.operations;

import e.emjinter.vm.*;
import e.emjinter.source.*;
import e.emjinter.Grammar;
import e.emjinter.exception.*;
import e.emjinter.exception.RuntimeException;


public class ComparisonCommand extends AbstractCommand {

  public ComparisonCommand(IVM vm)
  {
    super(vm);
   
    emojiCode = Grammar.CMD_COMP;
    numSymbols = -1;
  }

  @Override
  public void checkSyntax(IStream source) throws EmjInterExceptionBase {
    
    if(!registers.containsKey(source.checkNext()))
    {
      throw new InvalidParamException(String.format("Unrecognized token at pos %s. Invalid register location", 
          source.getPosition() + 1));
    }
    
    if(!Grammar.COMP_SET.contains(source.checkNext(1)))
    {
      throw new RuntimeException(String.format("Expected a comparison operator at pos %d", source.getPosition() + 2));
    }
    
    if(!registers.containsKey(source.checkNext(2)))
    {
      throw new InvalidParamException(String.format("Unrecognized token at pos %s. Invalid register location", 
          source.getPosition() + 1));
    }
    
    if(source.checkNext(3) == Grammar.CMD_COMP_END)
    { 
      throw new RuntimeException(String.format("Expecting the body of an if. But none was found at pos %d",  source.getPosition() + 3));
    }
    
    for(int i = 4; i < source.getLength() - source.getPosition(); i++)
    {
      if(source.checkNext(i) == Grammar.CMD_COMP_END) { return ; }
    }
    
    throw new RuntimeException("Expected end-if operator but one was not found");

  }

  @Override
  public void execute(IStream source) throws EmjInterExceptionBase {
    checkSyntax(source);
    
    int memLocationA = source.next();
    int comp = source.next();
    int memLocationB = source.next();
    boolean result = performComp(comp, memLocationA, memLocationB);
    
    int[] subSource = new int[65536];
    int i = 0;
    int cursor = 0;
    
    while(source.getPosition() < source.getLength())
    {
      cursor = source.next();
      if(cursor != Grammar.CMD_COMP_END)
      {
        subSource[i] = cursor;
        i++;
      }
      else { break; }
    }
    
    //If true, we want to execute the first bit of the if
    //then continue after the else
    if(result)
    {
      while((cursor = source.next()) != Grammar.CMD_COMP_END) continue; 
    }
    else
    {
      subSource = new int[65536];
      i = 0;
      while((cursor = source.next()) != Grammar.CMD_COMP_END)
      {
        subSource[i] = cursor;
        i++;
      }  
    }
    IStream subStream = new SubStream(subSource);
    vm.executeSubStream(subStream);
  }
  
  private boolean performComp(int comp, int refA, int refB)
  {
    int a = 0;
    int b = 0;
    
    if(registers.containsKey(refA)) { a = registers.getValue(refA); }
    else { a = variables.getValue(refA); }
    
    if(registers.containsKey(refB)) { b = registers.getValue(refB); }
    else { b = variables.getValue(refA); }
    
    
    switch(comp)
    {
      case Grammar.COMP_EQ:   { return a == b; }
      case Grammar.COMP_NE:   { return a != b; }
      case Grammar.COMP_LT:   { return a < b;  }
      case Grammar.COMP_GT:   { return a > b;  }
      case Grammar.COMP_E_GT: { return a >= b; }
      case Grammar.COMP_E_LT: { return a <= b; }  
    }
    return true;
  }

}
