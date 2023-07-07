import java.util.*;

public class Target {

int compareObjects(Comparable left,Comparable right){
  if (left != null) {
    if (right != null) {
      return left.compareTo(right);
    }
 else {
      return 1;
    }
  }
 else {
    if (right == null) {
      return 0;
    }
 else {
      return -1;
    }
  }
}
  int __target__(Comparable left,Comparable right){
  if (left != null) {
    if (right != null) {
      return left.compareTo(right);
    }
 else {
      return 1;
    }
  }
 else {
    if (right == null) {
      return 0;
    }
 else {
      return 1;
    }
  }
}

}