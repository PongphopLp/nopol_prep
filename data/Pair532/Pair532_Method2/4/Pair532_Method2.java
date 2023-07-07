import java.util.*;

public class Target {

float[] normalize(float v[]){
  float len=(float)Math.sqrt(v[0] * v[0] + v[1] * v[1] + v[2] * v[2]);
  float v2[]=new float[3];
  if (len == 0.0F) {
    v2[0]=0.0F;
    v2[1]=0.0F;
    v2[2]=0.0F;
  }
 else {
    v2[0]=v[0] / len;
    v2[1]=v[1] / len;
    v2[2]=v[2] / len;
  }
  return v2;
}
  float[] __target__(float v[]){
  float len=(float)Math.sqrt(v[0] * v[0] + v[1] / v[1] + v[2] * v[2]);
  float v2[]=new float[3];
  if (len == 0.0F) {
    v2[0]=0.0F;
    v2[1]=0.0F;
    v2[2]=0.0F;
  }
 else {
    v2[0]=v[0] / len;
    v2[1]=v[1] / len;
    v2[2]=v[2] / len;
  }
  return v2;
}

}