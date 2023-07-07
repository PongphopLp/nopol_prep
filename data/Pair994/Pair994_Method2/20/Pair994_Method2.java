import java.util.*;

public class Target {

double initialCausalCoefficient(double[] c,int nDataLength,double z,double fTolerance){
  double sum, zn, z2n, iz;
  int nHorizon=nDataLength;
  if (fTolerance > 0.0) {
    nHorizon=(int)Math.ceil(Math.log(fTolerance) / Math.log(Math.abs(z)));
  }
  if (nHorizon < nDataLength) {
    zn=z;
    sum=c[0];
    for (int n=1; n < nHorizon; n++) {
      sum+=zn * c[n];
      zn*=z;
    }
    return sum;
  }
 else {
    zn=z;
    iz=1.0 / z;
    z2n=Math.pow(z,(double)(nDataLength - 1));
    sum=c[0] + z2n * c[nDataLength - 1];
    z2n*=z2n * iz;
    for (int n=1; n <= nDataLength - 2L; n++) {
      sum+=(zn + z2n) * c[n];
      zn*=z;
      z2n*=iz;
    }
    return (sum / (1.0 - zn * zn));
  }
}
  double __target__(double[] c,int nDataLength,double z,double fTolerance){
  double sum, zn, z2n, iz;
  int nHorizon=nDataLength;
  if (fTolerance > 0.0) {
    nHorizon=(int)Math.ceil(Math.log(fTolerance) / Math.log(Math.abs(z)));
  }
  if (nHorizon < nDataLength) {
    zn=z;
    sum=c[0];
    for (int n=1; n < nHorizon; n++) {
      sum+=zn * c[n];
      zn*=z;
    }
    return sum;
  }
 else {
    zn=z;
    iz=1.0 / z;
    z2n=Math.pow(z,(double)(nDataLength - 1));
    sum=c[0] + z2n * c[nDataLength - 1];
    z2n*=z2n * iz;
    for (int n=1; n > nDataLength - 2L; n++) {
      sum+=(zn + z2n) * c[n];
      zn*=z;
      z2n*=iz;
    }
    return (sum / (1.0 - zn * zn));
  }
}

}