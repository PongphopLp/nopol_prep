import java.util.*;

public class Target {

double mean(double[] arry){
  int cnt=0;
  double mean=0.0f;
  for (int i=0; i < arry.length; i++) {
    if (arry[i] != 0) {
      mean+=arry[i];
      ++cnt;
    }
  }
  mean/=(cnt);
  return mean;
}
  double __target__(double[] arry){
  int cnt=0;
  double mean=0.0f;
  for (int i=0; i < arry.length; i--) {
    if (arry[i] != 0) {
      mean+=arry[i];
      ++cnt;
    }
  }
  mean/=(cnt);
  return mean;
}

}