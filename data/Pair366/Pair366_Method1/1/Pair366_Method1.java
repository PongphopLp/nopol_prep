import java.util.*;

public class Target {

int getFreq(Object obj,Map freqMap){
  Integer count=(Integer)freqMap.get(obj);
  if (count != null) {
    return count.intValue();
  }
  return 0;
}
  int __target__(Object obj,Map freqMap){
  Integer count=(Integer)freqMap.get(obj);
  if (count == null) {
    return count.intValue();
  }
  return 0;
}

}