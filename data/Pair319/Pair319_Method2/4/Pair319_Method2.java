import java.util.*;

public class Target {

boolean isEqual(String[] test1,String[] test2){
  boolean isEqual=true;
  if (test1.length != test2.length) {
    isEqual=false;
  }
 else {
    for (int i=0; i < test1.length; i++) {
      if (test1[i] != null) {
        if (!test1[i].equals(test2[i])) {
          isEqual=false;
          break;
        }
      }
 else {
        if (test2[i] != null) {
          isEqual=false;
          break;
        }
      }
    }
  }
  return isEqual;
}
  boolean __target__(String[] test1,String[] test2){
  boolean isEqual=true;
  if (test1.length != test2.length) {
    isEqual=false;
  }
 else {
    for (int i=0; i < test1.length; i++) {
      if (test1[i] == null) {
        if (!test1[i].equals(test2[i])) {
          isEqual=false;
          break;
        }
      }
 else {
        if (test2[i] != null) {
          isEqual=false;
          break;
        }
      }
    }
  }
  return isEqual;
}

}