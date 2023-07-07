import java.util.*;

public class Target {

boolean objectChanged(Object first,Object second){
  if (first == null) {
    if (second != null) {
      return true;
    }
  }
 else   if (second == null) {
    return true;
  }
 else   if (!first.equals(second)) {
    return true;
  }
  return false;
}
  boolean __target__(Object first,Object second){
  if (first == null) {
    if (second == null) {
      return true;
    }
  }
 else   if (second == null) {
    return true;
  }
 else   if (!first.equals(second)) {
    return true;
  }
  return false;
}

}