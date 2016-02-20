package e.emjinter;

public class CodeToStringConverter {
  public static String convert(int cmdVal)
  {
    switch(cmdVal)
    {
      
      //Registers
      case Grammar.REG_0: { return "Register: 1"; }
      case Grammar.REG_1: { return "Register: 2"; }
      case Grammar.REG_2: { return "Register: 3"; }
      case Grammar.REG_3: { return "Register: 4"; }
      case Grammar.REG_4: { return "Register: 5"; }
      case Grammar.REG_5: { return "Register: 6"; }
      case Grammar.REG_6: { return "Register: 7"; }
      case Grammar.REG_7: { return "Register: 8"; }
      case Grammar.REG_8: { return "Register: 9"; }
     
      //Print
      case Grammar.CMD_PRNT_START: { return "Print: Start"; }
    }
    
    return "Unknown";
  }
}
