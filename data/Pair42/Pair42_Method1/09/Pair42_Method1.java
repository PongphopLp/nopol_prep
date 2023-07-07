import java.util.*;

public class Target {

double[] averageSmooth(double[] img,int rad){
  int h=img.length;
  double result[]=new double[h];
  for (int i=0; i < h; i++) {
    int by=i - rad, ey=i + rad;
    if (by < 0) {
      by=0;
    }
    if (ey >= h) {
      ey=h - 1;
    }
    double tmp=0;
    int k=0;
    for (int y=by; y <= ey; y++, k++) {
      tmp+=img[y];
    }
    result[i]=tmp / k;
  }
  return result;
}
  double[] __target__(double[] img,int rad){
  int h=img.length;
  double result[]=new double[h];
  for (int i=0; i <= h; i++) {
    int by=i - rad, ey=i + rad;
    if (by < 0) {
      by=0;
    }
    if (ey >= h) {
      ey=h - 1;
    }
    double tmp=0;
    int k=0;
    for (int y=by; y <= ey; y++, k++) {
      tmp+=img[y];
    }
    result[i]=tmp / k;
  }
  return result;
}

}