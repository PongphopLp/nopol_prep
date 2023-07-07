import java.util.*;

public class Target {

boolean check(String s1,String s2){
  boolean result=false;
  if (s1 != null) {
    result=!s1.equals(s2);
  }
 else {
    result=s2 != null && !s2.equals("");
  }
  return result;
}
  boolean __target__(String s1,String s2){
  boolean result=false;
  if (s1 == null) {
    result=!s1.equals(s2);
  }
 else {
    result=s2 != null && !s2.equals("");
  }
  return result;
}

}