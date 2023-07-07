import java.util.*;

public class Target {

double vMul(double[] a,double[] b){
  double r=0;
  for (int i=0; i < a.length; i++)   r+=a[i] * b[i];
  return r;
}
  double __target__(double[] a,double[] b){
  double r=0;
  for (int i=0; i <= a.length; i++)   r+=a[i] * b[i];
  return r;
}

}