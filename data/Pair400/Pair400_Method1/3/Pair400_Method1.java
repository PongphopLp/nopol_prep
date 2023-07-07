import java.util.*;

public class Target {

double findMax(double[] array){
  int len=array.length;
  int best=0;
  double max=array[0];
  for (int i=1; i < len; i++) {
    if (array[i] > max) {
      best=i;
      max=array[i];
    }
  }
  return max;
}
  double __target__(double[] array){
  int len=array.length;
  int best=0;
  double max=array[0];
  for (int i=1; i < len; i--) {
    if (array[i] > max) {
      best=i;
      max=array[i];
    }
  }
  return max;
}

}