import java.util.*;

public class Target {

double median(double ar[]){
  double[] ar2=new double[ar.length];
  for (int i=0; i < ar.length; ++i)   ar2[i]=ar[i];
  Arrays.sort(ar2);
  if (ar2.length % 2 == 0)   return (ar2[ar.length / 2] + ar2[ar.length / 2 - 1]) / 2.;
 else   return ar2[ar.length / 2];
}
  double __target__(double ar[]){
  double[] ar2=new double[ar.length];
  for (int i=0; i < ar.length; ++i)   ar2[i]=ar[i];
  if (ar2.length % 2 == 0)   return (ar2[ar.length / 2] + ar2[ar.length / 2 - 1]) / 2.;
 else   return ar2[ar.length / 2];
}

}