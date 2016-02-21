package e.emjinter.vm;

import e.emjinter.source.*;

public interface IVM {
  AbstractKVPStore<Integer, Integer> getRegisters();
  AbstractKVPStore<Integer, Integer> getVariables();
  
  void executeSubStream(IStream stream);
}
