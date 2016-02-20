package e.emjinter.vm;

import java.util.*;

import e.emjinter.exception.RuntimeException;

public abstract class AbstractKVPStore<TKey, TVal> {
  protected  Map<TKey, TVal> data;
  
  public AbstractKVPStore()
  {
    data = new HashMap<TKey, TVal>();
  }
  
  
  protected boolean containsKey(TKey key)
  {
    return data.containsKey(key);
  }
  
  protected TVal getValue(TKey key)
  {
    return data.get(key);
  }
  
  protected abstract void addValue(TKey key, TVal value) throws RuntimeException;
}
