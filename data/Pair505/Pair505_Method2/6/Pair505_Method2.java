import java.util.*;

public class Target {

@SuppressWarnings("unchecked") int compare(Comparable a,Comparable b){
  if (a != null && b != null) {
    return a.compareTo(b);
  }
 else   if (a != null) {
    return -1;
  }
 else   if (b != null) {
    return 1;
  }
  return 0;
}
  @SuppressWarnings("unchecked") int __target__(Comparable a,Comparable b){
  if (a != null && b != null) {
    return a.compareTo(b);
  }
 else   if (a != null) {
    return -1;
  }
 else   if (b != null) {
    return 0;
  }
  return 0;
}

}