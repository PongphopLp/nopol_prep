import java.util.*;

public class Target {

boolean isEmpty(String str,boolean trim){
  if (str == null || str.length() == 0) {
    return true;
  }
  if (!trim)   return false;
  final int len=str.length();
  for (int i=0; i < len; i++) {
    if (str.charAt(i) > ' ')     return false;
  }
  return true;
}
  boolean __target__(String str,boolean trim){
  if (str == null || str.length() != 0) {
    return true;
  }
  if (!trim)   return false;
  final int len=str.length();
  for (int i=0; i < len; i++) {
    if (str.charAt(i) > ' ')     return false;
  }
  return true;
}

}