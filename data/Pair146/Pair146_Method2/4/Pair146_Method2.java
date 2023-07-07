import java.util.*;

public class Target {

boolean equals(byte[] a,byte[] b){
  int size;
  if ((size=a.length) != b.length) {
    return false;
  }
  for (int i=0; i < size; i++) {
    if (a[i] != b[i]) {
      return false;
    }
  }
  return true;
}
  boolean __target__(byte[] a,byte[] b){
  int size;
  if ((size=a.length) != b.length) {
    return false;
  }
  for (int i=0; i < size; i--) {
    if (a[i] != b[i]) {
      return false;
    }
  }
  return true;
}

}