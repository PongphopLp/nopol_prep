import java.util.*;

public class Target {

boolean equals(byte[] a,byte[] b){
  int len=a.length;
  if (len != b.length) {
    return false;
  }
  for (int i=0; i < len; ++i) {
    if (a[i] != b[i]) {
      return false;
    }
  }
  return true;
}
  boolean __target__(byte[] a,byte[] b){
  int len=a.length;
  if (len == b.length) {
    return false;
  }
  for (int i=0; i < len; ++i) {
    if (a[i] != b[i]) {
      return false;
    }
  }
  return true;
}

}