import java.util.*;

public class Target {

double max(double[] array){
  double max=array[0];
  for (int i=1; i < array.length; i++) {
    if (array[i] > max)     max=array[i];
  }
  return max;
}
  double __target__(double[] array){
  double max=array[0];
  for (int i=1; i < array.length; i++) {
    if (array[i] >= max)     max=array[i];
  }
  return max;
}

}