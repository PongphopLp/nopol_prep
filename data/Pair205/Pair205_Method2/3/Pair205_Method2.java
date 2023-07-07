import java.util.*;

public class Target {

boolean arrayEquals(int[] a1,int[] a2){
  if (a1 == a2) {
    return true;
  }
 else   if (a1 == null || a2 == null) {
    return false;
  }
 else   if (a1.length != a2.length) {
    return false;
  }
 else {
    for (int i=0; i < a1.length; i++) {
      if (a1[i] != a2[i]) {
        return false;
      }
    }
    return true;
  }
}
  boolean __target__(int[] a1,int[] a2){
  if (a1 == a2) {
    return true;
  }
 else   if (a1 != null || a2 == null) {
    return false;
  }
 else   if (a1.length != a2.length) {
    return false;
  }
 else {
    for (int i=0; i < a1.length; i++) {
      if (a1[i] != a2[i]) {
        return false;
      }
    }
    return true;
  }
}

}