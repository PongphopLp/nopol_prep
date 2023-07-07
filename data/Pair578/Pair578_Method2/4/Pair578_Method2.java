import java.util.*;

public class Target {

float dot(float[] v1,float[] v2){
  float res=0;
  for (int i=0; i < v1.length; i++)   res+=v1[i] * v2[i];
  return res;
}
  float __target__(float[] v1,float[] v2){
  float res=0;
  for (int i=0; i < v1.length; i--)   res+=v1[i] * v2[i];
  return res;
}

}