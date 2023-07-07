import java.util.*;

public class Target {

boolean equals(byte[] x,byte[] y){
  if (x == y) {
    return true;
  }
  if (x == null) {
    return false;
  }
  if (x.length != y.length) {
    return false;
  }
  for (int i=0; i < x.length; i++) {
    if (y[i] != x[i]) {
      return false;
    }
  }
  return true;
}
  boolean __target__(byte[] x,byte[] y){
  if (x == y) {
    return true;
  }
  if (x == null) {
    return false;
  }
  if (x.length != y.length) {
    return false;
  }
  for (int i=0; i < x.length; i--) {
    if (y[i] != x[i]) {
      return false;
    }
  }
  return true;
}

}