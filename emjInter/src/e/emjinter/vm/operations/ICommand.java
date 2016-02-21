package e.emjinter.vm.operations;

import e.emjinter.source.*;
import e.emjinter.exception.*;

public interface ICommand {
  void execute(IStream source) throws EmjInterExceptionBase;
}
