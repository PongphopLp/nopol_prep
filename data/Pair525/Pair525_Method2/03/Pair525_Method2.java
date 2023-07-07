import java.util.*;

public class Target {

boolean arraysEqual(Object[] ar1,Object[] ar2){
  if (ar1 == null && ar2 == null)   return true;
  if (ar1 == null || ar2 == null)   return false;
  if (ar1.length != ar2.length)   return false;
  for (int i=0; i < ar1.length; i++) {
    if (ar1[i] == null) {
      if (ar2[i] == null)       continue;
      return false;
    }
 else     if (ar2[i] == null)     return false;
    if (!ar1[i].equals(ar2[i]))     return false;
  }
  return true;
}
  boolean __target__(Object[] ar1,Object[] ar2){
  if (ar1 == null && ar2 != null)   return true;
  if (ar1 == null || ar2 == null)   return false;
  if (ar1.length != ar2.length)   return false;
  for (int i=0; i < ar1.length; i++) {
    if (ar1[i] == null) {
      if (ar2[i] == null)       continue;
      return false;
    }
 else     if (ar2[i] == null)     return false;
    if (!ar1[i].equals(ar2[i]))     return false;
  }
  return true;
}

}