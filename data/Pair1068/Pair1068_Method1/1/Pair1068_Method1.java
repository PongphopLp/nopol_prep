import java.util.*;

public class Target {

boolean equalsOrContains(String s1,String s2,int minLength){
  if ((s1.equals(s2) || s1.contains(s2) || s2.contains(s1)) && (s1.length() >= minLength && s2.length() >= minLength)) {
    return true;
  }
  return false;
}
  boolean __target__(String s1,String s2,int minLength){
  if ((s1.equals(s2) || s1.contains(s2) || s2.contains(s1)) && (s1.length() > minLength && s2.length() >= minLength)) {
    return true;
  }
  return false;
}

}