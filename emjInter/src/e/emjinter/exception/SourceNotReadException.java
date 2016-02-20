package e.emjinter.exception;

@SuppressWarnings("serial")
public class SourceNotReadException extends EmjInterExceptionBase {

  public SourceNotReadException(String filename) {
    super(String.format("The sourcefile (%s) was unable to be read.", filename));
  }

}
