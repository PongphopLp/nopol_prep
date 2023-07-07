import java.util.*;

public class Target {

String format(double num,int width,int decimals){
  double exp=Math.pow(10.0D,decimals);
  StringBuffer buffer;
  if ((num * exp <= -4.611686018427388E+18D) || (num * exp >= 4.611686018427388E+18D)) {
    String temp=Double.toString(num);
    buffer=new StringBuffer(temp);
  }
 else {
    double number;
    if (num < 0.0D)     number=-Math.round(-(num * exp));
 else     number=Math.round(num * exp);
    long n=(long)number;
    long iexp=Math.round(exp);
    long frac=(n < 0L) ? -n % iexp : n % iexp;
    buffer=new StringBuffer();
    buffer.insert(0,n / iexp);
    if ((n / iexp == 0L) && (n < 0L))     buffer.insert(0,'-');
    if (decimals > 0) {
      buffer.append('.');
    }
    while (iexp > 1L) {
      iexp/=10L;
      buffer.append(frac / iexp);
      frac%=iexp;
    }
  }
  int numOfSpaces=width - buffer.length();
  for (int i=0; i < numOfSpaces; ++i) {
    String temp;
    buffer.insert(0,' ');
  }
  return buffer.toString();
}
  String __target__(double num,int width,int decimals){
  double exp=Math.pow(10.0D,decimals);
  StringBuffer buffer;
  if ((num * exp <= -4.611686018427388E+18D) || (num * exp >= 4.611686018427388E+18D)) {
    String temp=Double.toString(num);
    buffer=new StringBuffer(temp);
  }
 else {
    double number;
    if (num < 0.0D)     number=-Math.round(-(num * exp));
 else     number=Math.round(num * exp);
    long n=(long)number;
    long iexp=Math.round(exp);
    long frac=(n < 0L) ? -n % iexp : n * iexp;
    buffer=new StringBuffer();
    buffer.insert(0,n / iexp);
    if ((n / iexp == 0L) && (n < 0L))     buffer.insert(0,'-');
    if (decimals > 0) {
      buffer.append('.');
    }
    while (iexp > 1L) {
      iexp/=10L;
      buffer.append(frac / iexp);
      frac%=iexp;
    }
  }
  int numOfSpaces=width - buffer.length();
  for (int i=0; i < numOfSpaces; ++i) {
    String temp;
    buffer.insert(0,' ');
  }
  return buffer.toString();
}

}