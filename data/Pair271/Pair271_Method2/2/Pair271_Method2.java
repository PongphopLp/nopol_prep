import java.util.*;

public class Target {

double innerProduct(double[] v1,double[] v2){
  double r=0;
  for (int i=0; i < v1.length; ++i) {
    r+=v1[i] * v2[i];
  }
  return r;
}
  double __target__(double[] v1,double[] v2){
  double r=0;
  for (int i=0; i < v1.length; --i) {
    r+=v1[i] * v2[i];
  }
  return r;
}

}