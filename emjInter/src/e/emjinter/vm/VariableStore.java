package e.emjinter.vm;

import e.emjinter.exception.RuntimeException;

public class VariableStore extends AbstractKVPStore<Integer, Integer> {

  public VariableStore()
  {
    super();
  }

  @Override
  protected void addValue(Integer key, Integer value) throws RuntimeException {
    if(containsKey(key)) { throw new RuntimeException(String.format("Variable Datastore. Key already exists with the value: %s", key)); }
    else  { data.put(key,  value); }
  }
  
  
}
