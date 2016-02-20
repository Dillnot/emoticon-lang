package e.emjinter.source;

import java.io.*;

import e.emjinter.exception.*;

public class SourceLoader {
  
  public static String Load(String filename) throws EmjInterExceptionBase
  {
    File source = new File(filename);
    FileReader fr = null;
    BufferedReader br = null;
    String sourceCode = "";
    String line = "";
    
    try
    {
      fr = new FileReader(source);
      br = new BufferedReader(fr);
    }
    catch (FileNotFoundException e) { throw new SourceNotFoundException(filename); }
    
    try
    {
      while((line = br.readLine()) != null)
      {
        sourceCode += line.replaceAll("\n","");
      }
      
      br.close();
      fr.close();
    }
    catch (IOException e) { throw new SourceNotReadException(filename); }
      
    return sourceCode;

  }
}
