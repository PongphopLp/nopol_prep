import java.util.*;

public class Target {

float[] trunc(float[] v,int n){
  int iN=v.length;
  if (iN == n)   return v;
  float[] nv=new float[n];
  for (int i=0; i < n; i++)   nv[i]=v[i];
  return nv;
}
  float[] __target__(float[] v,int n){
  int iN=v.length;
  if (iN == n)   return v;
  float[] nv=new float[n];
  for (int i=0; i <= n; i++)   nv[i]=v[i];
  return nv;
}

}