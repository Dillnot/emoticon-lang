package e.emjinter.exception;

@SuppressWarnings("serial")
public class SourceNotFoundException extends EmjInterExceptionBase {

  public SourceNotFoundException(String filename)
  {
    super(String.format("Source file (%s) was not found.", filename));
  }

}
