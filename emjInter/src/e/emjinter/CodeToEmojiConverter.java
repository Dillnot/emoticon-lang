package e.emjinter;

public class CodeToEmojiConverter {
  public static String convert(int cmdVal)
  {
    switch(cmdVal)
    {
      //Registers
      case Grammar.REG_0: { return "ðŸ˜º"; }
      case Grammar.REG_1: { return "ðŸ˜¸"; }
      case Grammar.REG_2: { return "ðŸ˜¹"; }
      case Grammar.REG_3: { return "ðŸ˜»"; }
      case Grammar.REG_4: { return "ðŸ˜¼"; }
      case Grammar.REG_5: { return "ðŸ˜½"; }
      case Grammar.REG_6: { return "ðŸ™€"; }
      case Grammar.REG_7: { return "ðŸ˜¿"; }
      case Grammar.REG_8: { return "ðŸ˜¾"; }
      
      //Print
      case Grammar.CMD_PRNT_START: { return "🗣"; }
     
    }
    
    return "-";
  }
}
