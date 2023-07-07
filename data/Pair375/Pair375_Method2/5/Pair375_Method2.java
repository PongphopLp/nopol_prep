import java.util.*;

public class Target {

double min(double[] v){
  double min=v[0];
  for (int i=1; i < v.length; i++) {
    if (min > v[i]) {
      min=v[i];
    }
  }
  return (min);
}
  double __target__(double[] v){
  double min=v[0];
  for (int i=1; i < v.length; i++) {
    if (min >= v[i]) {
      min=v[i];
    }
  }
  return (min);
}

}