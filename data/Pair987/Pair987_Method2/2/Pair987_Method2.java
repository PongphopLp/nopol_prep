import java.util.*;

public class Target {

int min(int[] X){
  int min=Integer.MAX_VALUE;
  int m=X.length;
  if (m == 0) {
    return 0;
  }
  for (int i=0; i < m; i++) {
    if (X[i] < min) {
      min=X[i];
    }
  }
  return min;
}
  int __target__(int[] X){
  int min=Integer.MAX_VALUE;
  int m=X.length;
  if (m != 0) {
    return 0;
  }
  for (int i=0; i < m; i++) {
    if (X[i] < min) {
      min=X[i];
    }
  }
  return min;
}

}