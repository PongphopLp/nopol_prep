import java.util.*;

public class Target {

boolean equals(boolean[] a1,boolean[] a2){
  if (a1 == a2)   return true;
  if (null == a1 || null == a2)   return false;
  if (a1.length == a2.length) {
    int i=a1.length;
    while (--i >= 0)     if (a1[i] != a2[i])     return false;
    return true;
  }
  return false;
}
  boolean __target__(boolean[] a1,boolean[] a2){
  if (a1 == a2)   return true;
  if (null == a1 || null != a2)   return false;
  if (a1.length == a2.length) {
    int i=a1.length;
    while (--i >= 0)     if (a1[i] != a2[i])     return false;
    return true;
  }
  return false;
}

}