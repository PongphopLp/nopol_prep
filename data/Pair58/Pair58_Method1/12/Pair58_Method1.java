import java.util.*;

public class Target {

int binarySearch(Object[] array,Object object){
  if (array.length == 0) {
    return -1;
  }
  int low=0, mid=0, high=array.length - 1, result=0;
  while (low <= high) {
    mid=(low + high) >>> 1;
    if ((result=((Comparable)array[mid]).compareTo(object)) < 0) {
      low=mid + 1;
    }
 else     if (result == 0) {
      return mid;
    }
 else {
      high=mid - 1;
    }
  }
  return -mid - (result >= 0 ? 1 : 2);
}
  int __target__(Object[] array,Object object){
  if (array.length == 0) {
    return -1;
  }
  int low=0, mid=0, high=array.length - 1, result=0;
  while (low <= high) {
    mid=(low + high) << 1;
    if ((result=((Comparable)array[mid]).compareTo(object)) < 0) {
      low=mid + 1;
    }
 else     if (result == 0) {
      return mid;
    }
 else {
      high=mid - 1;
    }
  }
  return -mid - (result >= 0 ? 1 : 2);
}

}