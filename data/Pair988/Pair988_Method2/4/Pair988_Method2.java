import java.util.*;

public class Target {

int findMax(int[] array){
  int max=array[0];
  for (int i=1; i < array.length; i++) {
    if (array[i] > max) {
      max=array[i];
    }
  }
  return max;
}
  int __target__(int[] array){
  int max=array[0];
  for (int i=1; i <= array.length; i++) {
    if (array[i] > max) {
      max=array[i];
    }
  }
  return max;
}

}