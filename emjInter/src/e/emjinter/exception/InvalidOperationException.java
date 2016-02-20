package e.emjinter.exception;

import e.emjinter.CodeToEmojiConverter;

@SuppressWarnings("serial")
public class InvalidOperationException extends EmjInterExceptionBase {
  
  public InvalidOperationException(int cmdVal, int sourcePos)
  {
    super(String.format("Invalid symbol %s at position %s.", CodeToEmojiConverter.convert(cmdVal), sourcePos));
  }
}
