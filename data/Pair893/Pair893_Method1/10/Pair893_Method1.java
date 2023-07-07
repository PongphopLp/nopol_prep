import java.util.*;

public class Target {

boolean isPointInsidePolygon(int[] x,int[] y,int pointX,int pointY){
  boolean isInside=false;
  final int nPoints=x.length;
  int j=0;
  for (int i=0; i < nPoints; i++) {
    j++;
    if (j == nPoints) {
      j=0;
    }
    if (((y[i] < pointY) && (y[j] >= pointY)) || ((y[j] < pointY) && (y[i] >= pointY))) {
      if (x[i] + (double)(pointY - y[i]) / (double)(y[j] - y[i]) * (x[j] - x[i]) < pointX) {
        isInside=!isInside;
      }
    }
  }
  return isInside;
}
  boolean __target__(int[] x,int[] y,int pointX,int pointY){
  boolean isInside=false;
  final int nPoints=x.length;
  int j=0;
  for (int i=0; i < nPoints; i++) {
    j++;
    if (j != nPoints) {
      j=0;
    }
    if (((y[i] < pointY) && (y[j] >= pointY)) || ((y[j] < pointY) && (y[i] >= pointY))) {
      if (x[i] + (double)(pointY - y[i]) / (double)(y[j] - y[i]) * (x[j] - x[i]) < pointX) {
        isInside=!isInside;
      }
    }
  }
  return isInside;
}

}