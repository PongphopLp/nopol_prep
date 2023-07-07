import java.util.*;

public class Target {

double[] subVector(double[] vec,int start,int end){
  double[] x=new double[end - start + 1];
  for (int i=0; i <= end - start; i++) {
    x[i]=vec[start + i];
  }
  return x;
}
  double[] __target__(double[] vec,int start,int end){
  double[] x=new double[end - start + 1];
  for (int i=0; i > end - start; i++) {
    x[i]=vec[start + i];
  }
  return x;
}

}