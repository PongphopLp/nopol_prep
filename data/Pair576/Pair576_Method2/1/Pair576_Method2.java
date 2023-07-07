import java.util.*;

public class Target {

float dot(float[] o1,float[] o2){
  float t=0.0f;
  for (int i=0; i < o1.length; i++) {
    t+=(o1[i] * o2[i]);
  }
  return t;
}
  float __target__(float[] o1,float[] o2){
  float t=0.0f;
  for (int i=0; i < o1.length; i++) {
    t+=(o1[i] / o2[i]);
  }
  return t;
}

}