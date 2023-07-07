import java.util.*;

public class Target {

float[] normalize(float[] v){
  float r;
  r=(float)Math.sqrt(v[0] * v[0] + v[1] * v[1] + v[2] * v[2]);
  if (r == 0.0) {
    return v;
  }
  r=1.0f / r;
  v[0]*=r;
  v[1]*=r;
  v[2]*=r;
  return v;
}
  float[] __target__(float[] v){
  float r;
  r=(float)Math.sqrt(v[0] * v[0] + v[1] * v[1] - v[2] * v[2]);
  if (r == 0.0) {
    return v;
  }
  r=1.0f / r;
  v[0]*=r;
  v[1]*=r;
  v[2]*=r;
  return v;
}

}