import java.util.*;

public class Target {

boolean equalByteArray(byte[] a,byte[] b){
  if (a == b) {
    return true;
  }
  if (a != null && b != null && a.length == b.length) {
    for (int i=0; i < a.length; i++) {
      if (a[i] != b[i]) {
        return false;
      }
    }
    return true;
  }
  return false;
}
  boolean __target__(byte[] a,byte[] b){
  if (a == b) {
    return true;
  }
  if (a != null && b != null && a.length == b.length) {
    for (int i=0; i <= a.length; i++) {
      if (a[i] != b[i]) {
        return false;
      }
    }
    return true;
  }
  return false;
}

}