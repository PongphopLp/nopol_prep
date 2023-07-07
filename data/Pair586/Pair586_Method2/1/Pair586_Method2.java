import java.util.*;

public class Target {

double getTotal(double[] array,int start,int end){
  double total=0.0;
  for (int i=start; i < end; i++) {
    total+=array[i];
  }
  return total;
}
  double __target__(double[] array,int start,int end){
  double total=0.0;
  for (int i=start; i < end; i--) {
    total+=array[i];
  }
  return total;
}

}