import java.util.*;

public class Target {

boolean arraysAreEqualN(byte[] a1,byte[] a2){
  if (a1 == null) {
    if (a2 == null) {
      return true;
    }
    return false;
  }
 else   if (a2 == null) {
    return false;
  }
  if (a1.length != a2.length)   return false;
  for (int i=0; i < a1.length; i++) {
    if (a1[i] != a2[i])     return false;
  }
  return true;
}
  boolean __target__(byte[] a1,byte[] a2){
  if (a1 == null) {
    if (a2 == null) {
      return true;
    }
    return false;
  }
 else   if (a2 == null) {
    return false;
  }
  if (a1.length != a2.length)   return false;
  for (int i=0; i < a1.length; i--) {
    if (a1[i] != a2[i])     return false;
  }
  return true;
}

}