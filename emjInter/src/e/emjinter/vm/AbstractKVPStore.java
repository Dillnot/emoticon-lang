package e.emjinter.vm;

import java.util.*;

import e.emjinter.exception.RuntimeException;

public abstract class AbstractKVPStore<TKey, TVal> {
  protected  Map<TKey, TVal> data;
  
  public AbstractKVPStore()
  {
    data = new HashMap<TKey, TVal>();
  }
  
  
  public boolean containsKey(TKey key)
  {
    return data.containsKey(key);
  }
  
  public TVal getValue(TKey key)
  {
    return data.get(key);
  }
  
  public abstract void addValue(TKey key, TVal value) throws RuntimeException;
  
  public abstract void updateValue(TKey key, TVal newValue);
  
  public String print()
  {
    StringBuilder sb = new StringBuilder();
    for(TKey key : data.keySet())
    {
      sb.append(String.format("Key: %s | Val: %s\n",key, data.get(key)));
    } 
    return sb.toString();
  }
}
