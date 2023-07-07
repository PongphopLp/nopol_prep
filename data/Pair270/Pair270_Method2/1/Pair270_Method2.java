import java.util.*;

public class Target {

double matrixProd(double[] m1,double[] m2){
  double res=0.0;
  for (int i=0; i < m1.length; i++) {
    res+=m1[i] * m2[i];
  }
  return res;
}
  double __target__(double[] m1,double[] m2){
  double res=0.0;
  for (int i=0; i < m1.length; i++) {
    res+=m1[i] / m2[i];
  }
  return res;
}

}