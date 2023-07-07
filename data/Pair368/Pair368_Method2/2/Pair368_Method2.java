import java.util.*;

public class Target {

double max(double[] d){
  double high=d[0];
  for (int k=1; k < d.length; k++) {
    if (d[k] > high) {
      high=d[k];
    }
  }
  return high;
}
  double __target__(double[] d){
  double high=d[0];
  for (int k=1; k < d.length; k++) {
    if (d[k] <= high) {
      high=d[k];
    }
  }
  return high;
}

}