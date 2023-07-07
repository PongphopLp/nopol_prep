import java.util.*;

public class Target {

boolean equals(byte[] a1,byte[] a2){
  if ((a1 == null) || (a2 == null)) {
    return a1 == a2;
  }
  int nLength=a1.length;
  if (nLength != a2.length) {
    return false;
  }
  for (int i=0; i < nLength; i++) {
    if (a1[i] != a2[i]) {
      return false;
    }
  }
  return true;
}
  boolean __target__(byte[] a1,byte[] a2){
  if ((a1 == null) || (a2 != null)) {
    return a1 == a2;
  }
  int nLength=a1.length;
  if (nLength != a2.length) {
    return false;
  }
  for (int i=0; i < nLength; i++) {
    if (a1[i] != a2[i]) {
      return false;
    }
  }
  return true;
}

}