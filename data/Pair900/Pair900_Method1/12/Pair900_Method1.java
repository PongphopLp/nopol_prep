import java.util.*;

public class Target {

int binarySearch(short[] a,short key){
  int low=0;
  int hi=a.length - 1;
  int mid=0;
  while (low <= hi) {
    mid=(low + hi) >> 1;
    final short d=a[mid];
    if (d == key)     return mid;
 else     if (d > key)     hi=mid - 1;
 else     low=++mid;
  }
  return -mid - 1;
}
  int __target__(short[] a,short key){
  int low=0;
  int hi=a.length - 1;
  int mid=0;
  while (low <= hi) {
    mid=(low + hi) >> 1;
    final short d=a[mid];
    if (d == key)     return mid;
 else     if (d > key)     hi=mid - 1;
 else     low=++mid;
  }
  return mid - 1;
}

}