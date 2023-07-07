import java.util.*;

public class Target {

int checkedCompare(Comparable o1,Comparable o2){
  if (o1 == null) {
    if (o2 == null)     return 0;
 else     return 1;
  }
 else   if (o2 == null) {
    if (o1 == null)     return 0;
 else     return -1;
  }
  return o1.compareTo(o2);
}
  int __target__(Comparable o1,Comparable o2){
  if (o1 == null) {
    if (o2 == null)     return 0;
 else     return 1;
  }
 else   if (o2 == null) {
    if (o1 == null)     return 0;
 else     return 1;
  }
  return o1.compareTo(o2);
}

}