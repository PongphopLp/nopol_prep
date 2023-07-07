import java.util.*;

public class Target {

int expt(int n,int k){
  assert (n >= 0) && (k >= 0);
  if (k == 0) {
    return 1;
  }
 else   if (n == 0) {
    return 0;
  }
 else {
    int accum=1;
    for (int i=0; i < k; i++) {
      assert (accum > 0) && ((n * accum) > 0);
      accum=n * accum;
    }
    return accum;
  }
}
  int __target__(int n,int k){
  assert (n >= 0) && (k >= 0);
  if (k != 0) {
    return 1;
  }
 else   if (n == 0) {
    return 0;
  }
 else {
    int accum=1;
    for (int i=0; i < k; i++) {
      assert (accum > 0) && ((n * accum) > 0);
      accum=n * accum;
    }
    return accum;
  }
}

}