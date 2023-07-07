import java.util.*;

public class Target {

int binarySearch(int[] array,int toIndex,int key){
  int low=0;
  int high=toIndex - 1;
  while (low <= high) {
    int mid=(low + high) >>> 1;
    int midVal=array[mid];
    if (midVal < key)     low=mid + 1;
 else     if (midVal > key)     high=mid - 1;
 else     return mid;
  }
  return -(low + 1);
}
  int __target__(int[] array,int toIndex,int key){
  int low=0;
  int high=toIndex - 1;
  while (low <= high) {
    int mid=(low + high) >>> 1;
    int midVal=array[mid];
    if (midVal < key)     low=mid + 1;
 else     if (midVal > key)     high=mid + 1;
 else     return mid;
  }
  return -(low + 1);
}

}