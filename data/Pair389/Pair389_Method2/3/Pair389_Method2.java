import java.util.*;

public class Target {

double getRightmost(double[] verteces){
  double r;
  r=verteces[0];
  for (int i=0; i < verteces.length; i++) {
    if (verteces[i] > r) {
      r=verteces[i];
    }
  }
  return r;
}
  double __target__(double[] verteces){
  double r;
  r=verteces[0];
  for (int i=0; i < verteces.length; i--) {
    if (verteces[i] > r) {
      r=verteces[i];
    }
  }
  return r;
}

}