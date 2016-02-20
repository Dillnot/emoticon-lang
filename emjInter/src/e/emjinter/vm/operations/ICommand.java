package e.emjinter.vm.operations;

import e.emjinter.exception.*;

public interface ICommand {
  void execute() throws EmjInterExceptionBase;
}
