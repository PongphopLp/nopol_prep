import java.util.*;

public class Target {

boolean equals(long[] a1,long[] a2){
  if (a1 == a2) {
    return true;
  }
  try {
    if (a1.length == a2.length) {
      for (int i=0; i < a1.length; i++) {
        if (a1[i] != a2[i]) {
          return false;
        }
      }
      return true;
    }
  }
 catch (  NullPointerException e) {
  }
  return false;
}
  boolean __target__(long[] a1,long[] a2){
  if (a1 == a2) {
    return true;
  }
  try {
    if (a1.length != a2.length) {
      for (int i=0; i < a1.length; i++) {
        if (a1[i] != a2[i]) {
          return false;
        }
      }
      return true;
    }
  }
 catch (  NullPointerException e) {
  }
  return false;
}

}