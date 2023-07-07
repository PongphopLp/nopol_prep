import java.util.*;

public class Target {

int compare(Integer i1,Integer i2){
  if (i1 == null) {
    return i2 == null ? 0 : -1;
  }
 else   if (i2 == null) {
    return 1;
  }
  return i1.intValue() < i2.intValue() ? -1 : i1.intValue() > i2.intValue() ? 1 : 0;
}
  int __target__(Integer i1,Integer i2){
  if (i1 == null) {
    return i2 == null ? 0 : -1;
  }
 else   if (i2 != null) {
    return 1;
  }
  return i1.intValue() < i2.intValue() ? -1 : i1.intValue() > i2.intValue() ? 1 : 0;
}

}