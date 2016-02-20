package e.emjinter.vm;

import e.emjinter.Grammar;

public class RegisterStore extends AbstractKVPStore<Integer, Integer> {
  
  public RegisterStore()
  {
    super();
    
    addRegisters();
  }
  
  
  private void addRegisters()
  {
    data.put(Grammar.REG_0, 0);
    data.put(Grammar.REG_1, 0);
    data.put(Grammar.REG_2, 0);
    data.put(Grammar.REG_3, 0);
    data.put(Grammar.REG_4, 0);
    data.put(Grammar.REG_5, 0);
    data.put(Grammar.REG_6, 0);
    data.put(Grammar.REG_7, 0);
    data.put(Grammar.REG_8, 0);
    
  }
  
  @Override
  public void addValue(Integer key, Integer value) throws RuntimeException
  {
    throw new RuntimeException(String.format("Register Datastore\nKey: %s\nVal: %s",  key, value)); 
  }
  
  @Override
  public void updateValue(Integer key, Integer newValue)
  {
    data.put(key, newValue);
  }
  
}
