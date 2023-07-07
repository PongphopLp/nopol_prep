import java.util.*;

public class Target {

boolean isSortedd(int[] array){
  boolean sorted=true;
  for (int i=0; i < array.length - 1 && sorted; ++i) {
    sorted=array[i] < array[i + 1];
  }
  return sorted;
}
  boolean __target__(int[] array){
  boolean sorted=true;
  for (int i=0; i < array.length - 1 && sorted; ++i) {
    sorted=array[i] <= array[i + 1];
  }
  return sorted;
}

}