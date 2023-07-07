import java.util.*;

public class Target {

boolean isPointInsidePolygon(double[] x,double[] y,double pointX,double pointY){
  boolean isInside=false;
  final int nPoints=x.length;
  int j=0;
  for (int i=0; i < nPoints; i++) {
    j++;
    if (j == nPoints)     j=0;
    if (y[i] < pointY && y[j] >= pointY || y[j] < pointY && y[i] >= pointY) {
      if (x[i] + (pointY - y[i]) / (y[j] - y[i]) * (x[j] - x[i]) < pointX) {
        isInside=!isInside;
      }
    }
  }
  return isInside;
}
  boolean __target__(double[] x,double[] y,double pointX,double pointY){
  boolean isInside=false;
  final int nPoints=x.length;
  int j=0;
  for (int i=0; i < nPoints; i++) {
    j++;
    if (j == nPoints)     j=0;
    if (y[i] <= pointY && y[j] >= pointY || y[j] < pointY && y[i] >= pointY) {
      if (x[i] + (pointY - y[i]) / (y[j] - y[i]) * (x[j] - x[i]) < pointX) {
        isInside=!isInside;
      }
    }
  }
  return isInside;
}

}