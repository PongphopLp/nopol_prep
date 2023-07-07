import java.util.*;

public class Target {

boolean compare(String s1,String s2,boolean ignoreCase){
  if (s1 == null) {
    return (s2 == null);
  }
 else   if (s2 == null) {
    return false;
  }
 else {
    return (ignoreCase) ? s1.equalsIgnoreCase(s2) : s1.equals(s2);
  }
}
  boolean __target__(String s1,String s2,boolean ignoreCase){
  if (s1 == null) {
    return (s2 == null);
  }
 else   if (s2 != null) {
    return false;
  }
 else {
    return (ignoreCase) ? s1.equalsIgnoreCase(s2) : s1.equals(s2);
  }
}

}