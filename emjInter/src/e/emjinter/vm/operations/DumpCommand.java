package e.emjinter.vm.operations;

import java.io.*;

import e.emjinter.*;
import e.emjinter.exception.*;
import e.emjinter.source.*;
import e.emjinter.vm.*;

public class DumpCommand extends AbstractCommand {

  private final String LINE_0 = "1.out";
  private final String LINE_1 = "2.out";
  private final String LINE_2 = "3.out";
  private final String LINE_3 = "4.out";
  private final String LINE_4 = "5.out";
  private final String LINE_5 = "6.out";
  private final String LINE_6 = "7.out";
  private final String LINE_7 = "8.out";
  private final String LINE_8 = "9.out";
  
  
  public DumpCommand(AbstractKVPStore<Integer, Integer> refRegisters, AbstractKVPStore<Integer, Integer> refVariables)
  {
    super(refRegisters, refVariables);

    emojiCode = Grammar.CMD_DUMP_START;
    numSymbols = -1;
  }

  @Override
  public void checkSyntax(SourceStream source) throws EmjInterExceptionBase {
    int i = 0;
    for(i = 0; i < source.getLength(); i++)
    {
      int memLocation = source.checkNext(i);
      if(memLocation == Grammar.CMD_DUMP_END) { break; }
      
      if(!registers.containsKey(memLocation) && !variables.containsKey(memLocation))
      {
        throw new InvalidParamException(String.format("Unexpected token at pos %s. Not a valid register value or variable identifier.",
          source.getPosition() + i));
      } 
    }
    
    if(!registers.containsKey(source.checkNext(i + 1)))
    {
      throw new InvalidParamException(String.format("Unexpected token at pos %s after print. Not a valid output line.", source.getPosition() + 1));
    }
    
  }

  @Override
  public void execute(SourceStream source) throws EmjInterExceptionBase {
    checkSyntax(source);

    String output = "";
    
    for(int i = 0; i < source.getLength(); i++)
    {
      int memLocation = source.next();
      if(memLocation == Grammar.CMD_DUMP_END) { break ; }
      
      if(registers.containsKey(memLocation)) { output += registers.getValue(memLocation); }
      else { output += (variables.getValue(memLocation)); } 
    }
    
    switch(source.next())
    {
      case Grammar.REG_0: { writeToFile(LINE_0, output); break; }
      case Grammar.REG_1: { writeToFile(LINE_1, output); break; }
      case Grammar.REG_2: { writeToFile(LINE_2, output); break; }
      case Grammar.REG_3: { writeToFile(LINE_3, output); break; }
      case Grammar.REG_4: { writeToFile(LINE_4, output); break; }
      case Grammar.REG_5: { writeToFile(LINE_5, output); break; }
      case Grammar.REG_6: { writeToFile(LINE_6, output); break; }
      case Grammar.REG_7: { writeToFile(LINE_7, output); break; }
      case Grammar.REG_8: { writeToFile(LINE_8, output); break; }
    }
  }

  private void writeToFile(String filename, String contents)
  {
    File f = new File(filename);
    
    try 
    {
      FileWriter fw = new FileWriter("output/" + f);
      fw.write(contents);
      fw.close();
    }
    catch (IOException e)
    {
      System.err.println("Failed to output data.");
      System.err.println(e.getMessage());
    }

  }
  
}
