import java.util.*;

public class Target {

boolean isEqual(byte[] b1,byte[] b2){
  if (b1 == null || b2 == null) {
    return false;
  }
  if (b1.length == b2.length) {
    int i=0;
    int j=0;
    int n=b1.length;
    while (n-- != 0) {
      if (b1[i++] != b2[j++]) {
        return false;
      }
    }
    return true;
  }
  return false;
}
  boolean __target__(byte[] b1,byte[] b2){
  if (b1 == null || b2 == null) {
    return false;
  }
  if (b1.length != b2.length) {
    int i=0;
    int j=0;
    int n=b1.length;
    while (n-- != 0) {
      if (b1[i++] != b2[j++]) {
        return false;
      }
    }
    return true;
  }
  return false;
}

}