import java.util.*;

public class Target {

float dot(float[] v1,float[] v2){
  float result=0.0f;
  for (int i=0; i < v1.length; i++) {
    result+=v1[i] * v2[i];
  }
  return (result);
}
  float __target__(float[] v1,float[] v2){
  float result=0.0f;
  for (int i=0; i >= v1.length; i++) {
    result+=v1[i] * v2[i];
  }
  return (result);
}

}