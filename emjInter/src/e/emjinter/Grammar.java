package e.emjinter;

import java.util.*;

class Emoji {
  
  public static final int FACE_SMILE = 128522;
  public static final int FACE_SAD = 128577;
  public static final int FACE_CONFUSED = 128533;
  public static final int FACE_LAUGHING = -32256;
  public static final int FACE_HAPPY =    -26624;
  public static final int FACE_FAIL =     -23808;
  public static final int FACE_EPIC_FAIL = -22784;
  public static final int FACE_SHOCK = -20992;
  public static final int FACE_GASP =  -20224;
  
  public static final int HEAD_SPEAK = 128483;
  
  public static final int FINGER_LEFT = -30720;
  public static final int FINGER_RIGHT = -28416;
  public static final int FINGER_MIDDLE = -24832;
  public static final int FINGER_OK = 128076;
  public static final int FINGER_THUMBS = -29440;
  
  //Register Values
  public static final int CAT_A = 128570;
  public static final int CAT_B = 128568;
  public static final int CAT_C = 128569;
  public static final int CAT_D = 128571;
  public static final int CAT_E = 128572;
  public static final int CAT_F = 128573;
  public static final int CAT_G = 128576;
  public static final int CAT_H = 128575;
  public static final int CAT_I = 128574;
  
  
  public static final int ARROW_LEFT = 11013;
  public static final int ARROW_UP = 11014;
  public static final int ARROW_DOWN = 11015;
  public static final int ARROW_UP_LEFT = 8599;
  public static final int ARROW_DOWN_LEFT  = 8600;
  public static final int ARROW_DOWN_RIGHT = 8601;
  public static final int ARROW_UP_RIGHT =  8598;
  // ???
  public static final int JOBBY = 128169;
  public static final int SHEEP = -28416;
  public static final int TORTISE = -24064;
  public static final int TOILET =  128701; 
  public static final int LIGHTBLUB = 128161;
  
  public static final int HEART = -4252;
  public static final int HEART_BROKEN = -24832;
}

public class Grammar
{
  //Arith Ops
  public static final int CMD_ADD = Emoji.FACE_SMILE;
  public static final int CMD_SUB = Emoji.FACE_SAD;
  
  //Register values
  public static final int REG_0 = Emoji.CAT_A;
  public static final int REG_1 = Emoji.CAT_B;
  public static final int REG_2 = Emoji.CAT_C;
  public static final int REG_3 = Emoji.CAT_D;
  public static final int REG_4 = Emoji.CAT_E;
  public static final int REG_5 = Emoji.CAT_F;
  public static final int REG_6 = Emoji.CAT_G;
  public static final int REG_7 = Emoji.CAT_H;
  public static final int REG_8 = Emoji.CAT_I;
  
  public static final int CMD_PRNT_START = Emoji.HEAD_SPEAK;
  public static final int CMD_PRNT_END   = Emoji.FINGER_OK;
  
  public static final int CMD_DUMP_START = Emoji.TOILET;
  public static final int CMD_DUMP_END   = Emoji.JOBBY;
  
  
  @SuppressWarnings("serial")
  public static final Set<Integer> REG_SET = new HashSet<Integer>()
      {{
        REG_SET.add(REG_0);
        REG_SET.add(REG_1);
        REG_SET.add(REG_2);
        REG_SET.add(REG_3);
        REG_SET.add(REG_4);
        REG_SET.add(REG_5);
        REG_SET.add(REG_6);
        REG_SET.add(REG_7);
        REG_SET.add(REG_8);
      }};
}
