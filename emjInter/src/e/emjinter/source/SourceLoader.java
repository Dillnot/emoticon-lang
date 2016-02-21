package e.emjinter.source;

import java.nio.file.*;
import java.io.IOException;

import e.emjinter.exception.*;

public class SourceLoader {
  
  public static byte[] Load(String filename) throws EmjInterExceptionBase
  {
    byte[] bytes;
    
    try
    {
      bytes = Files.readAllBytes(Paths.get(filename));
    }
    catch (IOException e) { throw new SourceNotReadException(filename); }
      
    return bytes;

  }
}
