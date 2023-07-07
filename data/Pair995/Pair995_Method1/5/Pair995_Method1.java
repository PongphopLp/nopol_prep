import java.util.*;

public class Target {

int findMin(int[] array){
  int min=array[0];
  for (int i=1; i < array.length; i++) {
    if (array[i] < min) {
      min=array[i];
    }
  }
  return min;
}
  int __target__(int[] array){
  int min=array[0];
  for (int i=1; i < array.length; i++) {
    if (array[i] <= min) {
      min=array[i];
    }
  }
  return min;
}

}