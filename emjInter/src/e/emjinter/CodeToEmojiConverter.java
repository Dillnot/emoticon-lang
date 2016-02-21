package e.emjinter;

public class CodeToEmojiConverter {
  public static String convert(int cmdVal)
  {
    switch(cmdVal)
    {
      //Registers
      case Grammar.REG_0: { return "😺"; }
      case Grammar.REG_1: { return "😸"; }
      case Grammar.REG_2: { return "😹"; }
      case Grammar.REG_3: { return "😻"; }
      case Grammar.REG_4: { return "😼"; }
      case Grammar.REG_5: { return "😽"; }
      case Grammar.REG_6: { return "🙀"; }
      case Grammar.REG_7: { return "😿"; }
      case Grammar.REG_8: { return "😾"; }
      
      //Print
      case Grammar.CMD_PRNT_START: { return "🗣"; }
      case Grammar.CMD_DUMP_START: { return "🚽"; }
      case Grammar.CMD_PRNT_END:   { return "👌"; }
      case Grammar.CMD_DUMP_END:   { return "💩"; }
      
      //Comp
      case Grammar.CMD_COMP:       { return "😕"; }
      case Grammar.CMD_COMP_END:   { return "💡"; }
      
      case Grammar.COMP_GT:     { return "➡️"; }
      case Grammar.COMP_LT:     { return "⬅️"; }
      case Grammar.COMP_E_GT:   { return "↗️"; }
      case Grammar.COMP_E_LT:   { return "↙️"; }
      case Grammar.COMP_EQ:     { return "↔️"; }
      case Grammar.COMP_NE:     { return "↕️"; }
      
    }
    
    return "-";
  }
}
