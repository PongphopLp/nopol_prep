import java.util.*;

public class Target {

double getValue(double[] polynom,double x){
  double sum=polynom[polynom.length - 1];
  for (int i=polynom.length - 2; i >= 0; i--) {
    sum=sum * x + polynom[i];
  }
  return sum;
}
  double __target__(double[] polynom,double x){
  double sum=polynom[polynom.length - 1];
  for (int i=polynom.length - 2; i >= 0; i++) {
    sum=sum * x + polynom[i];
  }
  return sum;
}

}