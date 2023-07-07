import java.util.*;

public class Target {

double max(double[] v){
  double max=v[0];
  for (int i=1; i < v.length; i++) {
    if (max < v[i]) {
      max=v[i];
    }
  }
  return (max);
}
  double __target__(double[] v){
  double max=v[0];
  for (int i=1; i < v.length; i++) {
    if (max <= v[i]) {
      max=v[i];
    }
  }
  return (max);
}

}