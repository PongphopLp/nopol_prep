import java.util.*;

public class Target {

int getIndex(Object[] array,Object key){
  for (int i=0; i < array.length; i++) {
    if (array[i] != null) {
      if (array[i].equals(key)) {
        return i;
      }
    }
  }
  return -1;
}
  int __target__(Object[] array,Object key){
  for (int i=0; i < array.length; i++) {
    if (array[i] == null) {
      if (array[i].equals(key)) {
        return i;
      }
    }
  }
  return -1;
}

}