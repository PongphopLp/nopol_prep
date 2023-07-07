import java.util.*;

public class Target {

boolean endsWith(String s,String end){
  if ((s == null) || (end == null)) {
    return false;
  }
  if (end.length() > s.length()) {
    return false;
  }
  String temp=s.substring(s.length() - end.length(),s.length());
  if (temp.equalsIgnoreCase(end)) {
    return true;
  }
 else {
    return false;
  }
}
  boolean __target__(String s,String end){
  if ((s == null) || (end == null)) {
    return false;
  }
  if (end.length() <= s.length()) {
    return false;
  }
  String temp=s.substring(s.length() - end.length(),s.length());
  if (temp.equalsIgnoreCase(end)) {
    return true;
  }
 else {
    return false;
  }
}

}