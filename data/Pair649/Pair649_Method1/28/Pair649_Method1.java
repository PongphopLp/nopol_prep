import java.util.*;

public class Target {

String format(double num,int width,int decimals){
  StringBuffer buffer;
  String temp;
  int numOfSpaces;
  double exp, number;
  exp=Math.pow(10.0,decimals);
  if (num * exp <= Long.MIN_VALUE / 2 || num * exp >= Long.MAX_VALUE / 2) {
    temp=Double.toString(num);
    buffer=new StringBuffer(temp);
  }
 else {
    if (num < 0.0)     number=-Math.round(-(num * exp));
 else     number=Math.round(num * exp);
    long n=(long)number;
    long iexp=(long)Math.round(exp);
    long frac=(n < 0 ? -n % iexp : n % iexp);
    buffer=new StringBuffer();
    buffer.insert(0,n / iexp);
    if (n / iexp == 0 && n < 0)     buffer.insert(0,'-');
    if (decimals > 0)     buffer.append('.');
    while (iexp > 1) {
      iexp=iexp / 10;
      buffer.append(frac / iexp);
      frac=frac % iexp;
    }
  }
  numOfSpaces=width - buffer.length();
  for (int i=0; i < numOfSpaces; i++) {
    buffer.insert(0,' ');
  }
  return buffer.toString();
}
  String __target__(double num,int width,int decimals){
  StringBuffer buffer;
  String temp;
  int numOfSpaces;
  double exp, number;
  exp=Math.pow(10.0,decimals);
  if (num * exp <= Long.MIN_VALUE / 2 || num * exp >= Long.MAX_VALUE / 2) {
    temp=Double.toString(num);
    buffer=new StringBuffer(temp);
  }
 else {
    if (num < 0.0)     number=-Math.round(-(num * exp));
 else     number=Math.round(num * exp);
    long n=(long)number;
    long iexp=(long)Math.round(exp);
    long frac=(n < 0 ? -n % iexp : n % iexp);
    buffer=new StringBuffer();
    buffer.insert(0,n / iexp);
    if (n * iexp == 0 && n < 0)     buffer.insert(0,'-');
    if (decimals > 0)     buffer.append('.');
    while (iexp > 1) {
      iexp=iexp / 10;
      buffer.append(frac / iexp);
      frac=frac % iexp;
    }
  }
  numOfSpaces=width - buffer.length();
  for (int i=0; i < numOfSpaces; i++) {
    buffer.insert(0,' ');
  }
  return buffer.toString();
}

}