package e.emjinter.vm.operations;

import e.emjinter.vm.*;
import e.emjinter.source.*;
import e.emjinter.exception.*;

public abstract class AbstractCommand implements ICommand {

  protected int emojiCode;
  protected int numSymbols;
  
  protected AbstractKVPStore<Integer, Integer> registers;
  protected AbstractKVPStore<Integer, Integer> variables;
  
  public AbstractCommand(AbstractKVPStore<Integer, Integer> refRegisters,
                          AbstractKVPStore<Integer, Integer> refVariables)
  {
    registers = refRegisters;
    variables = refVariables;
  }
  
  public abstract void checkSyntax(SourceStream source) throws EmjInterExceptionBase;
  
  public abstract void execute(SourceStream source) throws EmjInterExceptionBase;
  
}
