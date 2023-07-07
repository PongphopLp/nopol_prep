import java.util.*;

public class Target {

boolean isMonotoneIncreasing(int[] a){
  for (int i=1; i < a.length; i++) {
    if (a[i] <= a[i - 1]) {
      return false;
    }
  }
  return true;
}
  boolean __target__(int[] a){
  for (int i=1; i <= a.length; i++) {
    if (a[i] <= a[i - 1]) {
      return false;
    }
  }
  return true;
}

}