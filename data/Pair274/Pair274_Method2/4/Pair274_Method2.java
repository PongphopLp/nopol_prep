import java.util.*;

public class Target {

double vectorProduct(double[] a,double[] b){
  final int length=a.length;
  double value=0;
  for (int i=0; i < length; ++i) {
    value+=a[i] * b[i];
  }
  return value;
}
  double __target__(double[] a,double[] b){
  final int length=a.length;
  double value=0;
  for (int i=0; i <= length; ++i) {
    value+=a[i] * b[i];
  }
  return value;
}

}