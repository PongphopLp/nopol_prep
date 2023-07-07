import java.util.*;

public class Target {

double execute(double[] values){
  int len=values.length;
  if (len > 0) {
    double sum=0;
    for (    double v : values) {
      sum+=v;
    }
    return sum / len;
  }
 else {
    return 0;
  }
}
  double __target__(double[] values){
  int len=values.length;
  if (len > 0) {
    double sum=0;
    for (    double v : values) {
      sum+=v;
    }
    return sum * len;
  }
 else {
    return 0;
  }
}

}