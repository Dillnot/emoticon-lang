package e.emjinter;

import java.io.*;

import e.emjinter.source.*;

public class Program {

  public static void main(String[] args) throws UnsupportedEncodingException {
    SourceStream source = null;
    
    if(args.length != 1) { System.out.println("Usage: prog /path/to/source"); System.exit(-1); }
    
    try { source = SourceStream.FromFile(args[0]); }
    catch (Exception e) 
    { 
      System.out.println(e.getMessage());
      System.exit(-1);
    }
    
    System.out.println(source.getLength());
    System.out.println(source.getPosition());
    
    while(source.getPosition() < source.getLength())
    {
      switch(source.next())
      {
        case Grammar.HAPPY_FACE: { System.out.println(":)"); break; }
        case Grammar.SHOCKED_FACE: { System.out.println(":o"); break; }
        default:
        {
          System.out.println("FEK");
        }
      }
    }
  }

}
