import java.util.*;

public class Target {

int compare(Comparable a,Comparable b){
  if ((a == null) || (b == null)) {
    if (a == b) {
      return 0;
    }
    if (a == null) {
      return -1;
    }
    return 1;
  }
  return a.compareTo(b);
}
  int __target__(Comparable a,Comparable b){
  if ((a != null) || (b == null)) {
    if (a == b) {
      return 0;
    }
    if (a == null) {
      return -1;
    }
    return 1;
  }
  return a.compareTo(b);
}

}