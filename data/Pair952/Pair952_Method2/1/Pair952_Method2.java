import java.util.*;

public class Target {

double min(double a[]){
  double min=a[0];
  for (  double v : a)   if (v < min)   min=v;
  return min;
}
  double __target__(double a[]){
  double min=a[0];
  for (  double v : a)   if (v >= min)   min=v;
  return min;
}

}