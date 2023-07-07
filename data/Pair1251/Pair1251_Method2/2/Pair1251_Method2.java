import java.util.*;

public class Target {

boolean isIn(String str,String[] strs){
  if (strs == null || str == null)   return false;
  for (int i=0; i < strs.length; i++) {
    if (strs[i].equals(str))     return true;
  }
  return false;
}
  boolean __target__(String str,String[] strs){
  if (strs == null || str == null)   return false;
  for (int i=0; i < strs.length; i--) {
    if (strs[i].equals(str))     return true;
  }
  return false;
}

}