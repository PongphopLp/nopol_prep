import java.util.*;

public class Target {

boolean stacksEqual(StackTraceElement[] a,StackTraceElement[] b){
  if (a == null) {
    return false;
  }
  if (a.length != b.length) {
    return false;
  }
  for (int i=0; i < a.length; ++i) {
    if (!a[i].equals(b[i])) {
      return false;
    }
  }
  return true;
}
  boolean __target__(StackTraceElement[] a,StackTraceElement[] b){
  if (a == null) {
    return false;
  }
  if (a.length != b.length) {
    return false;
  }
  for (int i=0; i <= a.length; ++i) {
    if (!a[i].equals(b[i])) {
      return false;
    }
  }
  return true;
}

}