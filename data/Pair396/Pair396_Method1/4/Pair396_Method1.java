import java.util.*;

public class Target {

double min(double[] d){
  double low=d[0];
  for (int k=1; k < d.length; k++) {
    if (d[k] < low) {
      low=d[k];
    }
  }
  return low;
}
  double __target__(double[] d){
  double low=d[0];
  for (int k=1; k <= d.length; k++) {
    if (d[k] < low) {
      low=d[k];
    }
  }
  return low;
}

}