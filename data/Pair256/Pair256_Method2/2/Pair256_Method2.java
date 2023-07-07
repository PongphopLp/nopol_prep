import java.util.*;

public class Target {

boolean xStop(double[] x,double[] xold,double tolx){
  boolean stop=true;
  for (int i=0; i < x.length && stop; i++) {
    if (Math.abs(x[i] - xold[i]) > tolx) {
      stop=false;
    }
  }
  return stop;
}
  boolean __target__(double[] x,double[] xold,double tolx){
  boolean stop=true;
  for (int i=0; i < x.length && stop; i++) {
    if (Math.abs(x[i] + xold[i]) > tolx) {
      stop=false;
    }
  }
  return stop;
}

}