import java.util.*;

public class Target {

int max(int[] X){
  int max=Integer.MIN_VALUE;
  int m=X.length;
  if (m == 0) {
    return 0;
  }
  for (int i=0; i < m; i++) {
    if (X[i] > max) {
      max=X[i];
    }
  }
  return max;
}
  int __target__(int[] X){
  int max=Integer.MIN_VALUE;
  int m=X.length;
  if (m == 0) {
    return 0;
  }
  for (int i=0; i <= m; i++) {
    if (X[i] > max) {
      max=X[i];
    }
  }
  return max;
}

}