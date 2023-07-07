import java.util.*;

public class Target {

double totalMult(double[] a,double[] b){
  double total=0.0;
  for (int i=0; i < a.length; i++) {
    total+=(a[i] * b[i]);
  }
  return total;
}
  double __target__(double[] a,double[] b){
  double total=0.0;
  for (int i=0; i <= a.length; i++) {
    total+=(a[i] * b[i]);
  }
  return total;
}

}