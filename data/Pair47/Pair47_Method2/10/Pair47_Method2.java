import java.util.*;

public class Target {

boolean lessThanOrEqual(byte[] a,byte[] b){
  if (a.length <= b.length) {
    for (int i=0; i != a.length; i++) {
      int l=a[i] & 0xff;
      int r=b[i] & 0xff;
      if (r > l) {
        return true;
      }
 else       if (l > r) {
        return false;
      }
    }
    return true;
  }
 else {
    for (int i=0; i != b.length; i++) {
      int l=a[i] & 0xff;
      int r=b[i] & 0xff;
      if (r > l) {
        return true;
      }
 else       if (l > r) {
        return false;
      }
    }
    return false;
  }
}
  boolean __target__(byte[] a,byte[] b){
  if (a.length <= b.length) {
    for (int i=0; i != a.length; i++) {
      int l=a[i] & 0xff;
      int r=b[i] & 0xff;
      if (r > l) {
        return true;
      }
 else       if (l > r) {
        return false;
      }
    }
    return true;
  }
 else {
    for (int i=0; i != b.length; i++) {
      int l=a[i] & 0xff;
      int r=b[i] & 0xff;
      if (r >= l) {
        return true;
      }
 else       if (l > r) {
        return false;
      }
    }
    return false;
  }
}

}