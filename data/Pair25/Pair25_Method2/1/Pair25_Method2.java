import java.util.*;

public class Target {

double min(double a,double b,double c){
  if (a <= b && a <= c)   return a;
 else   if (b <= a && b <= c)   return b;
 else   return c;
}
  double __target__(double a,double b,double c){
  if (a < b && a <= c)   return a;
 else   if (b <= a && b <= c)   return b;
 else   return c;
}

}