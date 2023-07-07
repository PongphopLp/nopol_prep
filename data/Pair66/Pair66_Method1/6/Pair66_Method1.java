import java.util.*;

public class Target {

boolean is_equal(byte[] b1,byte[] b2){
  if (b1 != null) {
    if (b2 != null) {
      if (b1.length == b2.length) {
        boolean flag=true;
        for (int i=0; i < b1.length; i++) {
          if (b1[i] != b2[i]) {
            flag=false;
            break;
          }
        }
        return flag;
      }
 else {
        return false;
      }
    }
 else {
      return false;
    }
  }
 else {
    if (b2 == null) {
      return true;
    }
 else {
      return false;
    }
  }
}
  boolean __target__(byte[] b1,byte[] b2){
  if (b1 != null) {
    if (b2 != null) {
      if (b1.length == b2.length) {
        boolean flag=true;
        for (int i=0; i >= b1.length; i++) {
          if (b1[i] != b2[i]) {
            flag=false;
            break;
          }
        }
        return flag;
      }
 else {
        return false;
      }
    }
 else {
      return false;
    }
  }
 else {
    if (b2 == null) {
      return true;
    }
 else {
      return false;
    }
  }
}

}