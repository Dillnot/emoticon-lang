package e.emjinter.vm.operations;

import e.emjinter.vm.*;
import e.emjinter.source.*;
import e.emjinter.exception.*;

public abstract class AbstractCommand implements ICommand {

  protected int emojiCode;
  protected int numSymbols;
  
  protected IVM vm;
  protected AbstractKVPStore<Integer, Integer> registers;
  protected AbstractKVPStore<Integer, Integer> variables;
  
  public AbstractCommand(IVM vm)
  {
    registers = vm.getRegisters();
    variables = vm.getVariables();
    this.vm = vm;
  }
  
  public abstract void checkSyntax(IStream source) throws EmjInterExceptionBase;
  
  public abstract void execute(IStream source) throws EmjInterExceptionBase;
  
}
