import java.util.*;

public class Target {

double addLogNumbers(double x,double y){
  if (x == Double.NEGATIVE_INFINITY)   return y;
  if (y == Double.NEGATIVE_INFINITY)   return x;
  if (y <= x)   return x + Math.log(1 + Math.exp(y - x));
 else   return y + Math.log(1 + Math.exp(x - y));
}
  double __target__(double x,double y){
  if (x == Double.NEGATIVE_INFINITY)   return y;
  if (y == Double.NEGATIVE_INFINITY)   return x;
  if (y > x)   return x + Math.log(1 + Math.exp(y - x));
 else   return y + Math.log(1 + Math.exp(x - y));
}

}