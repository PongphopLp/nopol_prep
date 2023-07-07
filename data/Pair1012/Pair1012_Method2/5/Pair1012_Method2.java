import java.util.*;

public class Target {

boolean isSorted(int[] array){
  for (int i=1; i < array.length; ++i) {
    if (array[i - 1] > array[i])     return false;
  }
  return true;
}
  boolean __target__(int[] array){
  for (int i=1; i < array.length; ++i) {
    if (array[i - 1] <= array[i])     return false;
  }
  return true;
}

}