import java.util.*;

public class Target {

double getMax(double data[]){
  double max=data[0];
  for (int i=0; i < data.length; i++) {
    if (data[i] > max)     max=data[i];
  }
  return max;
}
  double __target__(double data[]){
  double max=data[0];
  for (int i=0; i <= data.length; i++) {
    if (data[i] > max)     max=data[i];
  }
  return max;
}

}