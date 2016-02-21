package e.emjinter.source;

import java.nio.charset.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.IntStream;

import e.emjinter.exception.*;

public class SourceStream {
  private int[] source;
  private int pos;
  private int length;
  
  private Set<Integer> buggeredBytes = new HashSet<Integer>();
  
  public SourceStream(byte[] source)
  {
    String sourceText = new String(source, StandardCharsets.UTF_8);
    IntStream sourceStream = sourceText.codePoints();
    
    //Random stuff that's new lines and line-breaks
    buggeredBytes.add(10);
    buggeredBytes.add(13);
    buggeredBytes.add(32);
    buggeredBytes.add(65039);
      
    this.source = new int[65535];
    int i = 0;
    Iterator<Integer> it = sourceStream.iterator();
    while(it.hasNext())
    {
      int val = (int)it.next();
      if(!buggeredBytes.contains(val))
      {
        this.source[i] = val;
        i++;
      }
    }
    
    this.pos    = 0;
    this.length  = i;
  }
  
  public int getPosition() { return pos; }
  public int getLength()   { return length; }
  
    
  public int next()
  {
    return source[pos++];
  }
  
  public int checkNext()
  {
    return source[pos];
  }
  
  public int checkNext(int offset)
  {
    return source[pos + offset];
  }
  
  public static SourceStream FromFile(String filename) throws EmjInterExceptionBase
  {
    byte[] contents = SourceLoader.Load(filename);
    return new SourceStream(contents);
  }
}
