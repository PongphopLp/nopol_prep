import java.util.*;

public class Target {

boolean isEqualTo(byte[] a,byte[] b){
  for (int i=0; i != a.length; i++) {
    if (a[i] != b[i]) {
      return false;
    }
  }
  return true;
}
  boolean __target__(byte[] a,byte[] b){
  for (int i=0; i != a.length; i++) {
    if (a[i] == b[i]) {
      return false;
    }
  }
  return true;
}

}