import java.util.*;

public class Target {

boolean isRealModification(Object o1,Object o2){
  if (o1 == null && o2 == null) {
    return false;
  }
  if (o1 != null && o2 == null) {
    return true;
  }
  if (o2 != null && o1 == null) {
    return true;
  }
  return !o1.equals(o2);
}
  boolean __target__(Object o1,Object o2){
  if (o1 == null && o2 == null) {
    return false;
  }
  if (o1 != null && o2 != null) {
    return true;
  }
  if (o2 != null && o1 == null) {
    return true;
  }
  return !o1.equals(o2);
}

}