import java.util.*;

public class Target {

int binarySearch(int[] a,int key){
  int low=0;
  int high=a.length - 1;
  while (low <= high) {
    int mid=(low + high) / 2;
    int midVal=a[mid];
    if (midVal < key)     low=mid + 1;
 else     if (midVal > key)     high=mid - 1;
 else     return mid;
  }
  return -(low + 1);
}
  int __target__(int[] a,int key){
  int low=0;
  int high=a.length - 1;
  while (low <= high) {
    int mid=(low + high) / 2;
    int midVal=a[mid];
    if (midVal < key)     low=mid + 1;
 else     if (midVal > key)     high=mid + 1;
 else     return mid;
  }
  return -(low + 1);
}

}