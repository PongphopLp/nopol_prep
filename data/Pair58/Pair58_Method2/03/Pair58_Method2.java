import java.util.*;

public class Target {

int binarySearch(Object[] a,Object key){
  int low=0;
  int high=a.length - 1;
  while (low <= high) {
    int mid=(low + high) >> 1;
    Object midVal=a[mid];
    int cmp=((Comparable)midVal).compareTo(key);
    if (cmp < 0)     low=mid + 1;
 else     if (cmp > 0)     high=mid - 1;
 else     return mid;
  }
  return -(low + 1);
}
  int __target__(Object[] a,Object key){
  int low=0;
  int high=a.length - 1;
  while (low <= high) {
    int mid=(low - high) >> 1;
    Object midVal=a[mid];
    int cmp=((Comparable)midVal).compareTo(key);
    if (cmp < 0)     low=mid + 1;
 else     if (cmp > 0)     high=mid - 1;
 else     return mid;
  }
  return -(low + 1);
}

}