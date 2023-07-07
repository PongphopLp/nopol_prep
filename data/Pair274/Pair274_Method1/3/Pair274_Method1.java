import java.util.*;

public class Target {

double dot(double[] v1,double[] v2){
  final int m=v1.length;
  double sum=0;
  for (int r=0; r < m; r++) {
    sum+=v1[r] * v2[r];
  }
  return sum;
}
  double __target__(double[] v1,double[] v2){
  final int m=v1.length;
  double sum=0;
  for (int r=0; r < m; r++) {
    sum+=v1[r] / v2[r];
  }
  return sum;
}

}