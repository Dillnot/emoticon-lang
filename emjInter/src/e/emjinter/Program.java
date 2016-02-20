package e.emjinter;

import java.io.*;

import e.emjinter.source.*;
import e.emjinter.vm.*;

public class Program {

  public static void main(String[] args) throws UnsupportedEncodingException {
    
    SourceStream source = null;
    emjVM vm = null;
    
    if(args.length != 1) { System.out.println("Usage: prog /path/to/source"); System.exit(-1); }
    
    System.out.println("Loading program source...");
    
    try { source = SourceStream.FromFile(args[0]); }
    catch (Exception e) 
    { 
      System.out.println(e.getMessage());
      System.exit(-1);
    }
    
    System.out.println("Setting up VM...");
    vm = new emjVM(source);
    
    vm.run();
    vm.debugShutdown();
  }

}
