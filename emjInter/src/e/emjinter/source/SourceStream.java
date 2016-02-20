package e.emjinter.source;

import e.emjinter.exception.*;

public class SourceStream {
  private byte[] source;
  private int pos;
  private int length;
  
  public SourceStream(String source)
  {
    this.source = source.getBytes();
    this.pos    = -1;
    this.length  = source.length();
  }
  
  public int getPosition() { return pos; }
  public int getLength()   { return length; }
  
  public int next()
  {
    int val = 0;
    
    for(int i = 0; i < 4; i++)
    {
      pos++;
      val |= source[pos];
      val = val << 8;
    }
    
    return val;
  }
  
  public static SourceStream FromFile(String filename) throws EmjInterExceptionBase
  {
    String contents = SourceLoader.Load(filename);
    return new SourceStream(contents);
  }
}
