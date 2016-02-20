package e.emjinter.source;

import e.emjinter.exception.*;

public class SourceStream {
  private int[] source;
  private int pos;
  private int length;
  
  public SourceStream(String source)
  {
    this.source = new int[source.getBytes().length / 4];
    processBytes(source.getBytes());
    
    this.pos    = 0;
    this.length  = this.source.length;
  }
  
  public int getPosition() { return pos; }
  public int getLength()   { return length; }
  
  private void processBytes(byte[] bytes)
  {
    int bytePos = -1;
    
    for(int i = 0; i < this.source.length; i++)
    {
      int val = 0;
      
      for(int j = 0; j < 4; j++)
      {
        bytePos++;
        val |= bytes[bytePos];
        val = val << 8;
      } 
      source[i] = val;
    }
  }
  
  
  public int next()
  {
    return source[pos++];
  }
  
  public static SourceStream FromFile(String filename) throws EmjInterExceptionBase
  {
    String contents = SourceLoader.Load(filename);
    return new SourceStream(contents);
  }
}
