package e.emjinter.vm;

import e.emjinter.exception.RuntimeException;

public class VariableStore extends AbstractKVPStore<Integer, Integer> {

  public VariableStore()
  {
    super();
  }

  @Override
  public void addValue(Integer key, Integer value) throws RuntimeException {
    data.put(key,  value);
  }
  
  @Override
  public void updateValue(Integer key, Integer newValue)
  {
    data.put(key,  newValue);
  }
  
  
}
