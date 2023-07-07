import java.util.*;

public class Target {

double median(double[] doubles){
  double[] sorted=doubles.clone();
  Arrays.sort(sorted);
  if (doubles.length % 2 == 0) {
    return (sorted[doubles.length / 2 - 1] + sorted[doubles.length / 2]) / 2;
  }
 else {
    return sorted[doubles.length / 2];
  }
}
  double __target__(double[] doubles){
  double[] sorted=doubles.clone();
  if (doubles.length % 2 == 0) {
    return (sorted[doubles.length / 2 - 1] + sorted[doubles.length / 2]) / 2;
  }
 else {
    return sorted[doubles.length / 2];
  }
}

}