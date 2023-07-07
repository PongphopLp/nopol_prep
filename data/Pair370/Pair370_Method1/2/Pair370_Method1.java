import java.util.*;

public class Target {

double kroneckerDelta(double i,double j){
  if (Double.isNaN(i) || Double.isNaN(j))   return Double.NaN;
  if (i == j)   return 1;
 else   return 0;
}
  double __target__(double i,double j){
  if (Double.isNaN(i) || Double.isNaN(j))   return Double.NaN;
  if (i == j)   return 0;
 else   return 0;
}

}