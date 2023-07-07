import java.util.*;

public class Target {

boolean equalsOrBothNull(Object o1,Object o2){
  if (o1 == null) {
    if (o2 != null) {
      return false;
    }
  }
 else   if (o2 == null) {
    return false;
  }
 else   if (!o1.equals(o2)) {
    return false;
  }
  return true;
}
  boolean __target__(Object o1,Object o2){
  if (o1 == null) {
    if (o2 == null) {
      return false;
    }
  }
 else   if (o2 == null) {
    return false;
  }
 else   if (!o1.equals(o2)) {
    return false;
  }
  return true;
}

}