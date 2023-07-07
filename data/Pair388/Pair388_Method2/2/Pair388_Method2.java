import java.util.*;

public class Target {

double min(double[] array){
  double min=array[0];
  for (  double d : array)   if (d < min)   min=d;
  return min;
}
  double __target__(double[] array){
  double min=array[0];
  for (  double d : array)   if (d <= min)   min=d;
  return min;
}

}