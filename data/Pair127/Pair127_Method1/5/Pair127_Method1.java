import java.util.*;

public class Target {

boolean equals(byte[] bytes1,byte[] bytes2){
  if (bytes1 == null && bytes2 == null) {
    return true;
  }
 else   if (bytes1 == null || bytes2 == null) {
    return false;
  }
  if (bytes1.length != bytes2.length) {
    return false;
  }
  for (int i=0; i < bytes1.length; i++) {
    if (bytes1[i] != bytes2[i]) {
      return false;
    }
  }
  return true;
}
  boolean __target__(byte[] bytes1,byte[] bytes2){
  if (bytes1 == null && bytes2 == null) {
    return true;
  }
 else   if (bytes1 == null || bytes2 == null) {
    return false;
  }
  if (bytes1.length == bytes2.length) {
    return false;
  }
  for (int i=0; i < bytes1.length; i++) {
    if (bytes1[i] != bytes2[i]) {
      return false;
    }
  }
  return true;
}

}