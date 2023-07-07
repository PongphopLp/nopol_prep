import java.util.*;

public class Target {

boolean equal(byte[] bytesA,byte[] bytesB){
  if (bytesA == bytesB) {
    return true;
  }
  if (bytesA == null || bytesB == null) {
    return false;
  }
  if (bytesA.length != bytesB.length) {
    return false;
  }
  for (int i=0; i < bytesA.length; i++) {
    if (bytesA[i] != bytesB[i])     return false;
  }
  return true;
}
  boolean __target__(byte[] bytesA,byte[] bytesB){
  if (bytesA == bytesB) {
    return true;
  }
  if (bytesA != null || bytesB == null) {
    return false;
  }
  if (bytesA.length != bytesB.length) {
    return false;
  }
  for (int i=0; i < bytesA.length; i++) {
    if (bytesA[i] != bytesB[i])     return false;
  }
  return true;
}

}