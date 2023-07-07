import java.util.*;

public class Target {

double max(double[] x){
  if (x.length == 0)   return Double.NaN;
  double max=-Double.MAX_VALUE;
  for (  double v : x) {
    if (max < v)     max=v;
  }
  return max;
}
  double __target__(double[] x){
  if (x.length == 0)   return Double.NaN;
  double max=Double.MAX_VALUE;
  for (  double v : x) {
    if (max < v)     max=v;
  }
  return max;
}

}