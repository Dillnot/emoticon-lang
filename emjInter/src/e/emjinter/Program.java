package e.emjinter;

import java.io.*;

import e.emjinter.source.*;
import e.emjinter.vm.*;

public class Program {

  public static void main(String[] args) throws UnsupportedEncodingException {
    
    SourceStream source = null;
    emjVM vm = null;
    
    if(args.length < 1) { System.out.println("Usage: prog /path/to/source"); System.exit(-1); }
    
    System.out.println("Loading program source...");
    
    try { source = SourceStream.FromFile(args[0]); }
    catch (Exception e) 
    { 
      System.out.println(e.getMessage());
      System.exit(-1);
    }
    
    if(args.length == 2)
    { 
      //Get processed values for code
      if (args[1].compareTo("-s") == 0)
      {
        while(source.getPosition() < source.getLength())
        {
          System.out.println(source.next());
        }
      }
    }
    else
    {
      //Actually run the code
      System.out.println("Setting up VM...");
      vm = new emjVM(source);
      
      if(args.length == 3)
      {
        if(args[2].endsWith(".in"))
        {
          InitFileLoader ifl = new InitFileLoader(vm, args[2]);
          ifl.Load();
        }
      }

      
      vm.run();
      //vm.debugShutdown();
    }
  }

}
