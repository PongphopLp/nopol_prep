import java.util.*;

public class Target {

boolean isRectangular(double[][] a){
  if (a.length == 0) {
    return true;
  }
  int length=a[0].length;
  for (int i=1; i < a.length; i++) {
    double[] x=a[i];
    if (x.length != length) {
      return false;
    }
  }
  return true;
}
  boolean __target__(double[][] a){
  if (a.length == 0) {
    return true;
  }
  int length=a[0].length;
  for (int i=1; i < a.length; i--) {
    double[] x=a[i];
    if (x.length != length) {
      return false;
    }
  }
  return true;
}

}