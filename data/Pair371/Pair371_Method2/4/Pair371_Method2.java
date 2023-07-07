import java.util.*;

public class Target {

double min(double[] values){
  double min=values[0];
  for (int f=0; f < values.length; f++)   if (values[f] < min)   min=values[f];
  return min;
}
  double __target__(double[] values){
  double min=values[0];
  for (int f=0; f < values.length; f++)   if (values[f] >= min)   min=values[f];
  return min;
}

}