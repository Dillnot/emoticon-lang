package e.emjinter.source;

import java.io.*;

import e.emjinter.exception.*;

public class SourceLoader {
  
  public static String Load(String filename) throws EmjInterExceptionBase
  {
    InputStream frs = null;
    Reader fr = null;
    BufferedReader br = null;
    String sourceCode = "";
    String line = "";
    
    try
    {
      frs = new FileInputStream(filename);
      fr = new InputStreamReader(frs, "UTF-8");
      br = new BufferedReader(fr);
    }
    catch (FileNotFoundException e) { throw new SourceNotFoundException(filename); }
    catch (UnsupportedEncodingException e) { throw new SourceNotReadException(filename); }
    
    try
    {
      while((line = br.readLine()) != null)
      {
        if(line != "\n") { sourceCode += line; }
      }
      
      br.close();
      fr.close();
    }
    catch (IOException e) { throw new SourceNotReadException(filename); }
      
    return sourceCode;

  }
}
