import java.util.*;

public class Target {

int nullSafeCompare(Comparable o1,Comparable o2,boolean nullBottom){
  if (o1 == null) {
    if (o2 == null) {
      return 0;
    }
    return nullBottom ? -1 : 1;
  }
  if (o2 == null) {
    return nullBottom ? 1 : -1;
  }
  return o1.compareTo(o2);
}
  int __target__(Comparable o1,Comparable o2,boolean nullBottom){
  if (o1 != null) {
    if (o2 == null) {
      return 0;
    }
    return nullBottom ? -1 : 1;
  }
  if (o2 == null) {
    return nullBottom ? 1 : -1;
  }
  return o1.compareTo(o2);
}

}