import java.util.*;

public class Target {

double cmod(double re,double im){
  double ans=0.;
  re=Math.abs(re);
  im=Math.abs(im);
  if (re == 0.0)   ans=im;
 else   if (im == 0.0)   ans=re;
 else   if (re > im) {
    double temp=im / re;
    ans=re * Math.sqrt(1. + temp * temp);
  }
 else {
    double temp=re / im;
    ans=im * Math.sqrt(1. + temp * temp);
  }
  return ans;
}
  double __target__(double re,double im){
  double ans=0.;
  re=Math.abs(re);
  im=Math.abs(im);
  if (re == 0.0)   ans=im;
 else   if (im == 0.0)   ans=re;
 else   if (re > im) {
    double temp=im / re;
    ans=re * Math.sqrt(1. - temp * temp);
  }
 else {
    double temp=re / im;
    ans=im * Math.sqrt(1. + temp * temp);
  }
  return ans;
}

}