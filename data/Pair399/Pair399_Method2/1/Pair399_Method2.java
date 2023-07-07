import java.util.*;

public class Target {

double max(double[] array){
  double max=array[0];
  for (  double d : array)   if (d > max)   max=d;
  return max;
}
  double __target__(double[] array){
  double max=array[0];
  for (  double d : array)   if (d <= max)   max=d;
  return max;
}

}