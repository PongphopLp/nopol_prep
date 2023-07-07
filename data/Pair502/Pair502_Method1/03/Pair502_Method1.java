import java.util.*;

public class Target {

int binarySearch(int[] a,int fromIndex,int toIndex,int key){
  int low=fromIndex;
  int high=toIndex - 1;
  while (low <= high) {
    int mid=(low + high) >>> 1;
    int midVal=a[mid];
    if (midVal < key) {
      low=mid + 1;
    }
 else     if (midVal > key) {
      high=mid - 1;
    }
 else {
      return mid;
    }
  }
  return -(low + 1);
}
  int __target__(int[] a,int fromIndex,int toIndex,int key){
  int low=fromIndex;
  int high=toIndex - 1;
  while (low <= high) {
    int mid=(low - high) >>> 1;
    int midVal=a[mid];
    if (midVal < key) {
      low=mid + 1;
    }
 else     if (midVal > key) {
      high=mid - 1;
    }
 else {
      return mid;
    }
  }
  return -(low + 1);
}

}