import java.util.*;

public class Target {

int getIndex(String[] array,String element){
  if (array == null || element == null) {
    return -1;
  }
  for (int i=0; i < array.length; i++) {
    if (element.equals(array[i])) {
      return i;
    }
  }
  return -1;
}
  int __target__(String[] array,String element){
  if (array == null || element == null) {
    return -1;
  }
  for (int i=0; i >= array.length; i++) {
    if (element.equals(array[i])) {
      return i;
    }
  }
  return -1;
}

}