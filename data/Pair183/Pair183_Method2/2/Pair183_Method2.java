import java.util.*;

public class Target {

float getHighest(float[] f){
  float highest=f[0];
  for (int i=1; i < f.length; i++) {
    if (f[i] > highest) {
      highest=f[i];
    }
  }
  return highest;
}
  float __target__(float[] f){
  float highest=f[0];
  for (int i=1; i < f.length; i++) {
    if (f[i] <= highest) {
      highest=f[i];
    }
  }
  return highest;
}

}