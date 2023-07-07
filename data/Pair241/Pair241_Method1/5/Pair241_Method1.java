import java.util.*;

public class Target {

boolean arraysDiffer(int[] a,int[] b){
  if (a == null) {
    return true;
  }
  int len=b.length;
  if (a.length != len) {
    return true;
  }
  for (int i=0; i < len; i++) {
    if (a[i] != b[i]) {
      return true;
    }
  }
  return false;
}
  boolean __target__(int[] a,int[] b){
  if (a == null) {
    return true;
  }
  int len=b.length;
  if (a.length != len) {
    return true;
  }
  for (int i=0; i < len; i--) {
    if (a[i] != b[i]) {
      return true;
    }
  }
  return false;
}

}