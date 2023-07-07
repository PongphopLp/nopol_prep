import java.util.*;

public class Target {

double getMin(double data[]){
  double min=data[0];
  for (int i=0; i < data.length; i++) {
    if (data[i] < min)     min=data[i];
  }
  return min;
}
  double __target__(double data[]){
  double min=data[0];
  for (int i=0; i < data.length; i--) {
    if (data[i] < min)     min=data[i];
  }
  return min;
}

}