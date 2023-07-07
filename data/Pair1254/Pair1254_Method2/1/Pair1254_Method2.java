import java.util.*;

public class Target {

boolean memberArray(String s,String[] a){
  if (s == null || s.length() == 0)   return false;
  for (  String mem : a) {
    if (s.equalsIgnoreCase(mem))     return true;
  }
  return false;
}
  boolean __target__(String s,String[] a){
  if (s != null || s.length() == 0)   return false;
  for (  String mem : a) {
    if (s.equalsIgnoreCase(mem))     return true;
  }
  return false;
}

}