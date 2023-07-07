import java.util.*;

public class Target {

double getLeftmost(double[] verteces){
  double l;
  l=verteces[0];
  for (int i=0; i < verteces.length; i++) {
    if (verteces[i] < l) {
      l=verteces[i];
    }
  }
  return l;
}
  double __target__(double[] verteces){
  double l;
  l=verteces[0];
  for (int i=0; i < verteces.length; i--) {
    if (verteces[i] < l) {
      l=verteces[i];
    }
  }
  return l;
}

}