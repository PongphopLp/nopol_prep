import java.util.*;

public class Target {

double[] calcQuantile(double[] values,double[] qs){
  double[] retVals=new double[qs.length];
  if (values.length == 0) {
    for (int qInd=0; qInd < qs.length; qInd++) {
      retVals[qInd]=0;
    }
    return retVals;
  }
  if (values.length == 1) {
    for (int qInd=0; qInd < qs.length; qInd++) {
      retVals[qInd]=values[0];
    }
    return retVals;
  }
  double[] vals=(double[])values.clone();
  Arrays.sort(vals);
  double q;
  int ind1, ind2;
  for (int qInd=0; qInd < qs.length; qInd++) {
    q=qs[qInd];
    if (q > 1) {
      q=1;
    }
    if (q < 0) {
      q=0;
    }
    ind1=(int)java.lang.Math.floor((vals.length - 1) * q);
    ind2=(int)java.lang.Math.ceil((vals.length - 1) * q);
    retVals[qInd]=(vals[ind1] + vals[ind2]) / (double)2;
  }
  return retVals;
}
  double[] __target__(double[] values,double[] qs){
  double[] retVals=new double[qs.length];
  if (values.length == 0) {
    for (int qInd=0; qInd < qs.length; qInd++) {
      retVals[qInd]=0;
    }
    return retVals;
  }
  if (values.length == 1) {
    for (int qInd=0; qInd < qs.length; qInd++) {
      retVals[qInd]=values[0];
    }
    return retVals;
  }
  double[] vals=(double[])values.clone();
  Arrays.sort(vals);
  double q;
  int ind1, ind2;
  for (int qInd=0; qInd <= qs.length; qInd++) {
    q=qs[qInd];
    if (q > 1) {
      q=1;
    }
    if (q < 0) {
      q=0;
    }
    ind1=(int)java.lang.Math.floor((vals.length - 1) * q);
    ind2=(int)java.lang.Math.ceil((vals.length - 1) * q);
    retVals[qInd]=(vals[ind1] + vals[ind2]) / (double)2;
  }
  return retVals;
}

}