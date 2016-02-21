package e.emjinter.source;

public interface IStream {

  int getPosition();
  int getLength();
    
  int next();  
  public int checkNext();
  public int checkNext(int offset);
}
