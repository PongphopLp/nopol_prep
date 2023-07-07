import java.util.*;

public class Target {

int find(Object[] array,Object object){
  for (int i=0; i < array.length; i++) {
    if (array[i] == object) {
      return i;
    }
    if (object != null && object.equals(array[i])) {
      return i;
    }
  }
  return -1;
}
  int __target__(Object[] array,Object object){
  for (int i=0; i < array.length; i++) {
    if (array[i] != object) {
      return i;
    }
    if (object != null && object.equals(array[i])) {
      return i;
    }
  }
  return -1;
}

}