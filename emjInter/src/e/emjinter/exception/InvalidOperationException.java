package e.emjinter.exception;

@SuppressWarnings("serial")
public class InvalidOperationException extends EmjInterExceptionBase {
  
  public InvalidOperationException(int cmdVal, int sourcePos)
  {
    super(String.format("Invalid symbol %s at position %s.", cmdVal, sourcePos));
  }
}
