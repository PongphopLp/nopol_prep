import java.util.*;

public class Target {

int compare(Object o1,Object o2){
  int gt;
  if (o1 == null && o2 == null) {
    gt=0;
  }
 else   if (o1 != null && o2 == null) {
    gt=1;
  }
 else   if (o1 == null && o2 != null) {
    gt=-1;
  }
 else   if (o1 instanceof Comparable) {
    gt=((Comparable)o1).compareTo(o2);
  }
 else {
    gt=0;
  }
  return gt;
}
  int __target__(Object o1,Object o2){
  int gt;
  if (o1 == null && o2 == null) {
    gt=0;
  }
 else   if (o1 != null && o2 == null) {
    gt=1;
  }
 else   if (o1 != null && o2 != null) {
    gt=-1;
  }
 else   if (o1 instanceof Comparable) {
    gt=((Comparable)o1).compareTo(o2);
  }
 else {
    gt=0;
  }
  return gt;
}

}