package e.emjinter.vm.operations;

import e.emjinter.exception.*;

public abstract class AbstractCommand implements ICommand {

  
  protected int emojiCode;
  protected int numSymbols;
  
  public abstract void CheckSyntax() throws EmjInterExceptionBase;
  
  public abstract void execute() throws EmjInterExceptionBase;
  
}
