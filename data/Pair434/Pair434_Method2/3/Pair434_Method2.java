import java.util.*;

public class Target {

boolean equals(Comparable o1,Comparable o2){
  if (o1 == null) {
    if (o2 == null) {
      return true;
    }
 else {
      return false;
    }
  }
 else {
    if (o2 == null) {
      return false;
    }
 else {
      return o1.compareTo(o2) == 0;
    }
  }
}
  boolean __target__(Comparable o1,Comparable o2){
  if (o1 == null) {
    if (o2 == null) {
      return true;
    }
 else {
      return false;
    }
  }
 else {
    if (o2 != null) {
      return false;
    }
 else {
      return o1.compareTo(o2) == 0;
    }
  }
}

}