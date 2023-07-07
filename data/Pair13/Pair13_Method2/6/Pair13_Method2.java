import java.util.*;

public class Target {

boolean endsWith(StringBuilder sb,String s){
  int len=s.length();
  if (sb.length() < len) {
    return false;
  }
  for (int i=sb.length() - len, j=0; j < len; i++, j++) {
    if (sb.charAt(i) != s.charAt(j)) {
      return false;
    }
  }
  return true;
}
  boolean __target__(StringBuilder sb,String s){
  int len=s.length();
  if (sb.length() >= len) {
    return false;
  }
  for (int i=sb.length() - len, j=0; j < len; i++, j++) {
    if (sb.charAt(i) != s.charAt(j)) {
      return false;
    }
  }
  return true;
}

}