import java.util.*;

public class Target {

double max(double[] values){
  double max=Double.NaN;
  if (values.length > 0) {
    max=values[0];
    for (int i=values.length; --i >= 1; ) {
      if (values[i] > max) {
        max=values[i];
      }
    }
  }
  return max;
}
  double __target__(double[] values){
  double max=Double.NaN;
  if (values.length <= 0) {
    max=values[0];
    for (int i=values.length; --i >= 1; ) {
      if (values[i] > max) {
        max=values[i];
      }
    }
  }
  return max;
}

}