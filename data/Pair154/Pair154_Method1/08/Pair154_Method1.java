import java.util.*;

public class Target {

boolean compareByteArrays(byte[] a,byte[] a2){
  boolean equal=false;
  if (a == a2) {
    equal=true;
  }
 else   if (a == null && a2 == null) {
    equal=true;
  }
 else   if (a == null || a2 == null) {
    equal=false;
  }
 else   if (a.length != a2.length) {
    equal=false;
  }
 else {
    equal=true;
    for (int i=0; i < a.length; i++) {
      if (a[i] != a2[i]) {
        equal=false;
        break;
      }
    }
  }
  return equal;
}
  boolean __target__(byte[] a,byte[] a2){
  boolean equal=false;
  if (a == a2) {
    equal=true;
  }
 else   if (a == null && a2 == null) {
    equal=true;
  }
 else   if (a == null || a2 == null) {
    equal=false;
  }
 else   if (a.length == a2.length) {
    equal=false;
  }
 else {
    equal=true;
    for (int i=0; i < a.length; i++) {
      if (a[i] != a2[i]) {
        equal=false;
        break;
      }
    }
  }
  return equal;
}

}