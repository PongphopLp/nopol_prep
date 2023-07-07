import java.util.*;

public class Target {

double evalPolynomial(double[] coeff,double t){
  int n=coeff.length - 1;
  double r=coeff[n];
  for (int i=n - 1; i >= 0; i--) {
    r=coeff[i] + (r * t);
  }
  return r;
}
  double __target__(double[] coeff,double t){
  int n=coeff.length - 1;
  double r=coeff[n];
  for (int i=n - 1; i > 0; i--) {
    r=coeff[i] + (r * t);
  }
  return r;
}

}