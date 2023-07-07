import java.util.*;

public class Target {

boolean equals(int list1[],int list2[]){
  try {
    if (list1.length != list2.length) {
      return false;
    }
 else {
      int scan=list1.length;
      while (--scan >= 0) {
        if (list1[scan] != list2[scan]) {
          return false;
        }
      }
      return true;
    }
  }
 catch (  Exception ex) {
    return false;
  }
}
  boolean __target__(int list1[],int list2[]){
  try {
    if (list1.length != list2.length) {
      return false;
    }
 else {
      int scan=list1.length;
      while (--scan > 0) {
        if (list1[scan] != list2[scan]) {
          return false;
        }
      }
      return true;
    }
  }
 catch (  Exception ex) {
    return false;
  }
}

}