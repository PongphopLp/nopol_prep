import java.util.*;

public class Target {

boolean byteArrayEquals(byte[] lhs,byte[] rhs){
  if (lhs == null && rhs != null || lhs != null && rhs == null) {
    return false;
  }
  if (lhs == rhs) {
    return true;
  }
  if (lhs.length != rhs.length) {
    return false;
  }
  for (int i=0; i < lhs.length; i++) {
    if (lhs[i] != rhs[i]) {
      return false;
    }
  }
  return true;
}
  boolean __target__(byte[] lhs,byte[] rhs){
  if (lhs == null && rhs == null || lhs != null && rhs == null) {
    return false;
  }
  if (lhs == rhs) {
    return true;
  }
  if (lhs.length != rhs.length) {
    return false;
  }
  for (int i=0; i < lhs.length; i++) {
    if (lhs[i] != rhs[i]) {
      return false;
    }
  }
  return true;
}

}