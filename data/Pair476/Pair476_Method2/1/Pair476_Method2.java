import java.util.*;

public class Target {

boolean safeEquals(String s1,String s2,boolean ignoreCase){
  if (s1 == s2) {
    return true;
  }
  if (s1 == null) {
    return false;
  }
  if (s2 == null) {
    return false;
  }
  if (ignoreCase) {
    return s1.equalsIgnoreCase(s2);
  }
 else {
    return s1.equals(s2);
  }
}
  boolean __target__(String s1,String s2,boolean ignoreCase){
  if (s1 != s2) {
    return true;
  }
  if (s1 == null) {
    return false;
  }
  if (s2 == null) {
    return false;
  }
  if (ignoreCase) {
    return s1.equalsIgnoreCase(s2);
  }
 else {
    return s1.equals(s2);
  }
}

}