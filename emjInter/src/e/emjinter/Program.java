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
    
    PrintStream out = new PrintStream(System.out, true, "UTF-8");
    out.print(source.next());
    out.print(source.next());
  }

}
