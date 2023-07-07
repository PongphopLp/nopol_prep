import java.util.*;

public class Target {

boolean hasChanged(Object[] oldRow,Object[] newRow,int[] indexColumns){
  for (  int c : indexColumns) {
    Object o=oldRow[c], n=newRow[c];
    if (o == null && n == null)     continue;
    if (o == null || n == null)     return true;
    if (!o.equals(n))     return true;
  }
  return false;
}
  boolean __target__(Object[] oldRow,Object[] newRow,int[] indexColumns){
  for (  int c : indexColumns) {
    Object o=oldRow[c], n=newRow[c];
    if (o != null && n == null)     continue;
    if (o == null || n == null)     return true;
    if (!o.equals(n))     return true;
  }
  return false;
}

}