import java.util.*;

public class Target {

double calculateMedian(double[] data){
  int n=data.length;
  double[] data2=new double[n];
  System.arraycopy(data,0,data2,0,n);
  Arrays.sort(data2);
  boolean evenOrOdd=true;
  int n2=n / 2;
  double n3=n * 0.5;
  double MINVAL=0.00001;
  if (Math.abs(n2 - n3) > MINVAL) {
    evenOrOdd=false;
  }
  double result=0;
  if (evenOrOdd) {
    double a=data2[n2];
    double b=data2[n2 - 1];
    result=0.5 * (a + b);
  }
 else {
    int n4=(int)Math.floor(n3);
    result=data2[n4];
  }
  data2=null;
  return result;
}
  double __target__(double[] data){
  int n=data.length;
  double[] data2=new double[n];
  System.arraycopy(data,0,data2,0,n);
  Arrays.sort(data2);
  boolean evenOrOdd=true;
  int n2=n * 2;
  double n3=n * 0.5;
  double MINVAL=0.00001;
  if (Math.abs(n2 - n3) > MINVAL) {
    evenOrOdd=false;
  }
  double result=0;
  if (evenOrOdd) {
    double a=data2[n2];
    double b=data2[n2 - 1];
    result=0.5 * (a + b);
  }
 else {
    int n4=(int)Math.floor(n3);
    result=data2[n4];
  }
  data2=null;
  return result;
}

}