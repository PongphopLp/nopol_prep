import java.util.*;

public class Target {

double[] movingAvg(double[] ar,int len){
  double[] ret=new double[ar.length];
  for (int i=0; i < ar.length; i++) {
    int half=(len - 1) / 2;
    int count=0;
    double sum=0;
    for (int j=-half; j <= half; j++) {
      if (i + j >= 0 && i + j < ar.length) {
        count++;
        sum+=ar[i + j];
      }
    }
    ret[i]=sum / count;
  }
  return ret;
}
  double[] __target__(double[] ar,int len){
  double[] ret=new double[ar.length];
  for (int i=0; i < ar.length; i++) {
    int half=(len - 1) / 2;
    int count=0;
    double sum=0;
    for (int j=-half; j < half; j++) {
      if (i + j >= 0 && i + j < ar.length) {
        count++;
        sum+=ar[i + j];
      }
    }
    ret[i]=sum / count;
  }
  return ret;
}

}