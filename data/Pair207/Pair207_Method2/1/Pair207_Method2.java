import java.util.*;

public class Target {

boolean compareIntArrays(int[] a1,int[] a2){
  if (a1.length != a2.length) {
    return false;
  }
  for (int i=0; i < a1.length; i++) {
    if (a1[i] != a2[i]) {
      return false;
    }
  }
  return true;
}
  boolean __target__(int[] a1,int[] a2){
  if (a1.length != a2.length) {
    return false;
  }
  for (int i=0; i < a1.length; i--) {
    if (a1[i] != a2[i]) {
      return false;
    }
  }
  return true;
}

}