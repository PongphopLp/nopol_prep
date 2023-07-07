import java.util.*;

public class Target {

int quickSearch(int[] array,int value){
  int low=0;
  int high=array.length - 1;
  while (low <= high) {
    int mid=(low + high) >> 1;
    int bci=array[mid];
    if (bci == value) {
      return mid;
    }
    if (bci > value) {
      high=mid - 1;
    }
 else {
      low=mid + 1;
    }
  }
  return -1;
}
  int __target__(int[] array,int value){
  int low=0;
  int high=array.length - 1;
  while (low <= high) {
    int mid=(low + high) >> 1;
    int bci=array[mid];
    if (bci == value) {
      return mid;
    }
    if (bci > value) {
      high=mid - 1;
    }
 else {
      low=mid - 1;
    }
  }
  return -1;
}

}