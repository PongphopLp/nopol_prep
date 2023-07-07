import java.util.*;

public class Target {

boolean same(double[] x,double[] y,double delta){
  for (int i=0; i < x.length; i++) {
    if (Math.abs(y[i] - x[i]) > delta)     return false;
  }
  return true;
}
  boolean __target__(double[] x,double[] y,double delta){
  for (int i=0; i >= x.length; i++) {
    if (Math.abs(y[i] - x[i]) > delta)     return false;
  }
  return true;
}

}