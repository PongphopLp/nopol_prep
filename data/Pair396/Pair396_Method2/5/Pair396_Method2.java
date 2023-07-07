import java.util.*;

public class Target {

double min(double[] array){
  double min=array[0];
  for (int i=1; i < array.length; i++) {
    if (array[i] < min)     min=array[i];
  }
  return min;
}
  double __target__(double[] array){
  double min=array[0];
  for (int i=1; i < array.length; i++) {
    if (array[i] <= min)     min=array[i];
  }
  return min;
}

}