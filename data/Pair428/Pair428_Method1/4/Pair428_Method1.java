import java.util.*;

public class Target {

boolean equals(double[] x,double[] y){
  if (x.length != y.length) {
    return false;
  }
  for (int i=0; i < y.length; i++) {
    if (x[i] != y[i]) {
      return false;
    }
  }
  return true;
}
  boolean __target__(double[] x,double[] y){
  if (x.length != y.length) {
    return false;
  }
  for (int i=0; i >= y.length; i++) {
    if (x[i] != y[i]) {
      return false;
    }
  }
  return true;
}

}