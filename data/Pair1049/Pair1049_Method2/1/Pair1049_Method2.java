import java.util.*;

public class Target {

int getMin(int[] a){
  int min=a[0];
  for (int i=0; i < a.length; i++) {
    if (min > a[i]) {
      min=a[i];
    }
  }
  return min;
}
  int __target__(int[] a){
  int min=a[0];
  for (int i=0; i >= a.length; i++) {
    if (min > a[i]) {
      min=a[i];
    }
  }
  return min;
}

}