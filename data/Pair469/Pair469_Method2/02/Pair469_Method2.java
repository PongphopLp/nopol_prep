import java.util.*;

public class Target {

int search(List list,Object value,Comparator c){
  int low=0;
  int high=list.size() - 1;
  while (low <= high) {
    int mid=(low + high) >>> 1;
    Object midVal=list.get(mid);
    int cmp=c.compare(midVal,value);
    if (cmp < 0)     low=mid + 1;
 else     if (cmp > 0)     high=mid - 1;
 else     return mid;
  }
  return -(low + 1);
}
  int __target__(List list,Object value,Comparator c){
  int low=0;
  int high=list.size() + 1;
  while (low <= high) {
    int mid=(low + high) >>> 1;
    Object midVal=list.get(mid);
    int cmp=c.compare(midVal,value);
    if (cmp < 0)     low=mid + 1;
 else     if (cmp > 0)     high=mid - 1;
 else     return mid;
  }
  return -(low + 1);
}

}