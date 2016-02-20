package e.emjinter.vm;


public class RegisterStore extends AbstractKVPStore<Integer, Integer> {
  
  private final String SOURCE = "Register";
  
  public RegisterStore()
  {
    super();
    
    addRegisters();
  }
  
  
  private void addRegisters()
  {
    //Add the register values to the key store.
  }
  
  @Override
  protected void addValue(Integer key, Integer value) throws RuntimeException
  {
    throw new RuntimeException(String.format("Register Datastore\nKey: %s\nVal: %s",  key, value));  }
}
