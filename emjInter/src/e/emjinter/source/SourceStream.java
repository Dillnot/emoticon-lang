package e.emjinter.source;

import e.emjinter.exception.*;

public class SourceStream {
  private char[] source;
  private int pos;
  private int length;
  
  public SourceStream(String source)
  {
    this.source = source.toCharArray();
    this.pos    = -1;
    this.length  = source.length();
  }
  
  public int getPosition() { return pos; }
  public int getLength()   { return length; }
  
  public char next()
  {
    pos++;
    return source[pos];
  }
  
  public static SourceStream FromFile(String filename) throws EmjInterExceptionBase
  {
    String contents = SourceLoader.Load(filename);
    return new SourceStream(contents);
  }
}
