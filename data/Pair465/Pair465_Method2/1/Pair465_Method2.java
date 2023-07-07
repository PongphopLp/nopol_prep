import java.util.*;

public class Target {

int find(int value,int[] array){
  for (int i=array.length; --i >= 0; ) {
    if (array[i] == value) {
      return i;
    }
  }
  return -1;
}
  int __target__(int value,int[] array){
  for (int i=array.length; --i < 0; ) {
    if (array[i] == value) {
      return i;
    }
  }
  return -1;
}

}