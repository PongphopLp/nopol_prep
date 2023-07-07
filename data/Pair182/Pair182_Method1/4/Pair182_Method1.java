import java.util.*;

public class Target {

float getLowest(float[] f){
  float lowest=f[0];
  for (int i=1; i < f.length; i++) {
    if (f[i] < lowest) {
      lowest=f[i];
    }
  }
  return lowest;
}
  float __target__(float[] f){
  float lowest=f[0];
  for (int i=1; i <= f.length; i++) {
    if (f[i] < lowest) {
      lowest=f[i];
    }
  }
  return lowest;
}

}