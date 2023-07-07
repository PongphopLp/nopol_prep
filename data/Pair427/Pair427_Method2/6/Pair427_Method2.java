import java.util.*;

public class Target {

boolean equals(double[] a1,double[] a2){
  if (a1 == a2)   return true;
  if (null == a1 || null == a2)   return false;
  if (a1.length == a2.length) {
    int i=a1.length;
    while (--i >= 0)     if (a1[i] - a2[i] != 0)     return false;
    return true;
  }
  return false;
}
  boolean __target__(double[] a1,double[] a2){
  if (a1 == a2)   return true;
  if (null == a1 || null == a2)   return false;
  if (a1.length != a2.length) {
    int i=a1.length;
    while (--i >= 0)     if (a1[i] - a2[i] != 0)     return false;
    return true;
  }
  return false;
}

}