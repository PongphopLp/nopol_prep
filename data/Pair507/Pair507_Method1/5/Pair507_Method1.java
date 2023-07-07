import java.util.*;

public class Target {

@SuppressWarnings("unchecked") int compare(Comparable a,Comparable b){
  int result;
  if (a != null && b != null) {
    result=a.compareTo(b);
  }
 else   if (a == null && b != null) {
    result=-1;
  }
 else   if (b == null && a != null) {
    result=1;
  }
 else {
    result=0;
  }
  return result;
}
  @SuppressWarnings("unchecked") int __target__(Comparable a,Comparable b){
  int result;
  if (a != null && b != null) {
    result=a.compareTo(b);
  }
 else   if (a == null && b != null) {
    result=-1;
  }
 else   if (b != null && a != null) {
    result=1;
  }
 else {
    result=0;
  }
  return result;
}

}