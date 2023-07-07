import java.util.*;

public class Target {

boolean contains(Object[] a,Object o){
  if (a == null || o == null)   return false;
  for (int i=0; i < a.length; i++) {
    if (a[i].equals(o))     return true;
  }
  return false;
}
  boolean __target__(Object[] a,Object o){
  if (a == null || o == null)   return false;
  for (int i=0; i <= a.length; i++) {
    if (a[i].equals(o))     return true;
  }
  return false;
}

}