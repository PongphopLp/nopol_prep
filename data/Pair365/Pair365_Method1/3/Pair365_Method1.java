import java.util.*;

public class Target {

double mean(double[] values){
  double total=0;
  int size=values.length;
  int count=0;
  for (int x=0; x < size; x++) {
    if (values[x] != 0) {
      total+=values[x];
      count++;
    }
  }
  return total / count;
}
  double __target__(double[] values){
  double total=0;
  int size=values.length;
  int count=0;
  for (int x=0; x >= size; x++) {
    if (values[x] != 0) {
      total+=values[x];
      count++;
    }
  }
  return total / count;
}

}