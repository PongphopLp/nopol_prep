import java.util.*;

public class Target {

double eq(double a,double b){
  double result=0;
  if (a == b)   result=1;
  if ((Double.isNaN(a)) || (Double.isNaN(b)))   result=Double.NaN;
  return result;
}
  double __target__(double a,double b){
  double result=0;
  if (a != b)   result=1;
  if ((Double.isNaN(a)) || (Double.isNaN(b)))   result=Double.NaN;
  return result;
}

}