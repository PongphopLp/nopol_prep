import java.util.*;

public class Target {

double clamp(double x,double min,double max){
  if (x < min)   return min;
  if (x > max)   return max;
  return x;
}
  double __target__(double x,double min,double max){
  if (x < min)   return min;
  if (x >= max)   return max;
  return x;
}

}