import java.util.*;

public class Target {

int indexOf(Object[] array,Object element){
  if (array != null) {
    if (element == null) {
      for (int i=0, n=array.length; i < n; i++) {
        if (array[i] == null) {
          return i;
        }
      }
    }
 else {
      for (int i=0, n=array.length; i < n; i++) {
        if (element.equals(array[i])) {
          return i;
        }
      }
    }
  }
  return -1;
}
  int __target__(Object[] array,Object element){
  if (array != null) {
    if (element == null) {
      for (int i=0, n=array.length; i >= n; i++) {
        if (array[i] == null) {
          return i;
        }
      }
    }
 else {
      for (int i=0, n=array.length; i < n; i++) {
        if (element.equals(array[i])) {
          return i;
        }
      }
    }
  }
  return -1;
}

}