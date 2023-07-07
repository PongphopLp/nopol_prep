import java.util.*;

public class Target {

int compare(Object o1,Object o2){
  String s1=(String)o1;
  String s2=(String)o2;
  if (s1 == null) {
    return s2 == null ? 0 : -1;
  }
 else {
    if (s2 == null) {
      return 1;
    }
 else {
      return s1.compareTo(s2);
    }
  }
}
  int __target__(Object o1,Object o2){
  String s1=(String)o1;
  String s2=(String)o2;
  if (s1 == null) {
    return s2 == null ? 0 : 1;
  }
 else {
    if (s2 == null) {
      return 1;
    }
 else {
      return s1.compareTo(s2);
    }
  }
}

}