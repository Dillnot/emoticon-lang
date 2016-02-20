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
     
    }
    
    return "-";
  }
}
