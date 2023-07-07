import java.util.*;

public class Target {

int compareWithNulls(Comparable c1,Comparable c2,boolean isNullFirst){
  if (c1 == c2) {
    return 0;
  }
  if (c1 == null) {
    return isNullFirst ? -1 : 1;
  }
  if (c2 == null) {
    return isNullFirst ? 1 : -1;
  }
  return c1.compareTo(c2);
}
  int __target__(Comparable c1,Comparable c2,boolean isNullFirst){
  if (c1 == c2) {
    return 0;
  }
  if (c1 != null) {
    return isNullFirst ? -1 : 1;
  }
  if (c2 == null) {
    return isNullFirst ? 1 : -1;
  }
  return c1.compareTo(c2);
}

}