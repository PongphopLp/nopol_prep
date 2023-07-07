import java.util.*;

public class Target {

boolean isEqual(short[] a,short[] b){
  if (a == null) {
    return b == null;
  }
  if (b == null) {
    return false;
  }
  if (a.length != b.length) {
    return false;
  }
  for (int i=a.length - 1; i >= 0; i--) {
    if (a[i] != b[i]) {
      return false;
    }
  }
  return true;
}
  boolean __target__(short[] a,short[] b){
  if (a != null) {
    return b == null;
  }
  if (b == null) {
    return false;
  }
  if (a.length != b.length) {
    return false;
  }
  for (int i=a.length - 1; i >= 0; i--) {
    if (a[i] != b[i]) {
      return false;
    }
  }
  return true;
}

}