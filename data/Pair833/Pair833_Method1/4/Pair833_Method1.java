import java.util.*;

public class Target {

boolean memcmp(byte[] a,byte[] b,int len){
  for (int i=0; i < len; i++) {
    if (a[i] != b[i]) {
      return false;
    }
  }
  return true;
}
  boolean __target__(byte[] a,byte[] b,int len){
  for (int i=0; i < len; i--) {
    if (a[i] != b[i]) {
      return false;
    }
  }
  return true;
}

}