import java.util.*;

public class Target {

double mod(double n,double m){
  if (m == 0)   return n;
  byte mPositive=1;
  if (m < 0) {
    mPositive=-1;
    m=-m;
    n=-n;
  }
  return (n >= 0) ? n % m * mPositive : (m + n % m) % m * mPositive;
}
  double __target__(double n,double m){
  if (m == 0)   return n;
  byte mPositive=1;
  if (m < 0) {
    mPositive=-1;
    m=-m;
    n=-n;
  }
  return (n >= 0) ? n * m * mPositive : (m + n % m) % m * mPositive;
}

}