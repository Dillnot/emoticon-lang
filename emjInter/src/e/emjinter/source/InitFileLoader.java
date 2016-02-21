package e.emjinter.source;

import java.io.*;
import java.util.*;
import java.nio.file.*;
import java.nio.charset.*;
import java.util.stream.*;

import e.emjinter.Grammar;
import e.emjinter.vm.*;

public class InitFileLoader {

  private IVM vm;
  private String filename;
  
  public InitFileLoader(IVM vm, String initFilePath)
  {
    this.vm = vm;
    this.filename = initFilePath;
  }
  
  
  public void Load()
  {
    List<String> contents;
    try { contents = Files.readAllLines(Paths.get(filename), StandardCharsets.UTF_8); } 
    catch (IOException e) { e.printStackTrace(); return; }
    
    String firstLine = contents.get(0);
    contents.remove(0);
    String[] splitLine = firstLine.split(",");
    
    vm.getRegisters().updateValue(Grammar.REG_0, Integer.parseInt(splitLine[0]));
    vm.getRegisters().updateValue(Grammar.REG_1, Integer.parseInt(splitLine[1]));
    vm.getRegisters().updateValue(Grammar.REG_2, Integer.parseInt(splitLine[2]));
    vm.getRegisters().updateValue(Grammar.REG_3, Integer.parseInt(splitLine[3]));
    vm.getRegisters().updateValue(Grammar.REG_4, Integer.parseInt(splitLine[4]));
    vm.getRegisters().updateValue(Grammar.REG_5, Integer.parseInt(splitLine[5]));
    vm.getRegisters().updateValue(Grammar.REG_6, Integer.parseInt(splitLine[6]));
    vm.getRegisters().updateValue(Grammar.REG_7, Integer.parseInt(splitLine[7]));
    vm.getRegisters().updateValue(Grammar.REG_8, Integer.parseInt(splitLine[8]));
    
    for(String line : contents)
    {
      String[] sLine = line.split(",");
      String val = new String(sLine[0].getBytes(), StandardCharsets.UTF_8);
      IntStream valStream = val.codePoints();
      Iterator<Integer> it = valStream.iterator();
      
      vm.getVariables().updateValue((int)it.next(), Integer.parseInt(sLine[1]));
    }
  }
  
  
}
