import java.util.*;

public class Target {

float getMin(float[] a){
  float min=a[0];
  for (int i=0; i < a.length; i++) {
    if (min > a[i]) {
      min=a[i];
    }
  }
  return min;
}
  float __target__(float[] a){
  float min=a[0];
  for (int i=0; i >= a.length; i++) {
    if (min > a[i]) {
      min=a[i];
    }
  }
  return min;
}

}