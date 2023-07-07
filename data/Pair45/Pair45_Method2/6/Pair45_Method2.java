import java.util.*;

public class Target {

boolean equals(char[] a,int start,int length,char[] a2){
  if (a2.length != length)   return false;
  for (int i=0; i < length; i++) {
    if (a[i + start] != a2[i])     return false;
  }
  return true;
}
  boolean __target__(char[] a,int start,int length,char[] a2){
  if (a2.length != length)   return false;
  for (int i=0; i < length; i++) {
    if (a[i + start] == a2[i])     return false;
  }
  return true;
}

}