import java.util.*;

public class Target {

boolean arrayContains(String[] a,String val){
  for (int i=0; i < a.length; i++) {
    if (a[i] == null) {
      if (val == null) {
        return true;
      }
    }
 else {
      if (a[i].equals(val)) {
        return true;
      }
    }
  }
  return false;
}
  boolean __target__(String[] a,String val){
  for (int i=0; i < a.length; i++) {
    if (a[i] != null) {
      if (val == null) {
        return true;
      }
    }
 else {
      if (a[i].equals(val)) {
        return true;
      }
    }
  }
  return false;
}

}