import java.util.*;

public class Target {

boolean arrayEquals(Object[] a,Object[] b){
  if (a == b)   return true;
  if ((a == null && b != null) || (a != null && b == null))   return false;
  if (a == null && b == null)   return true;
  if (a.length != b.length)   return false;
  for (int i=0; i < a.length; i++) {
    if (a[i] == null) {
      if (b[i] != null)       return false;
    }
 else {
      if (!a[i].equals(b[i]))       return false;
    }
  }
  return true;
}
  boolean __target__(Object[] a,Object[] b){
  if (a == b)   return true;
  if ((a == null && b != null) || (a != null && b == null))   return false;
  if (a == null && b == null)   return true;
  if (a.length != b.length)   return false;
  for (int i=0; i <= a.length; i++) {
    if (a[i] == null) {
      if (b[i] != null)       return false;
    }
 else {
      if (!a[i].equals(b[i]))       return false;
    }
  }
  return true;
}

}