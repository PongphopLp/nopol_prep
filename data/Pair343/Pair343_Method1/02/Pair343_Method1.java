import java.util.*;

public class Target {

double less_efficient_sumLogProb(double a,double b){
  if (a == Double.NEGATIVE_INFINITY && b == Double.NEGATIVE_INFINITY)   return Double.NEGATIVE_INFINITY;
 else   if (a > b)   return a + Math.log(1 + Math.exp(b - a));
 else   return b + Math.log(1 + Math.exp(a - b));
}
  double __target__(double a,double b){
  if (a == Double.NEGATIVE_INFINITY && b == Double.NEGATIVE_INFINITY)   return Double.NEGATIVE_INFINITY;
 else   if (a > b)   return a - Math.log(1 + Math.exp(b - a));
 else   return b + Math.log(1 + Math.exp(a - b));
}

}