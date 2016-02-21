package e.emjinter.source;

public class SubStream implements IStream {
  private int[] source;
  private int pos;
  private int length;
  
  public SubStream(int[] source)
  {
    this.source = source;
    this.pos = 0;
    
    int i = 0;
    for(i = 0; i < source.length; i++)
    {
      if(source[i] == 0 ) { break; }
    }
    
    this.length = i;
  }
  
  public int getPosition() { return pos; }
  public int getLength() { return length; }
  
  public int next() { return source[pos++]; }
  public int checkNext() { return source[pos + 1]; }
  public int checkNext(int offset) { return source[pos + offset]; }
}
