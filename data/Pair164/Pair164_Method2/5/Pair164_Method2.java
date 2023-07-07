import java.util.*;

public class Target {

boolean hasEqualBytes(byte[] one,byte[] two){
  if ((one == null) || (two == null)) {
    return false;
  }
  if (one.length != two.length) {
    return false;
  }
  int length=one.length;
  int byteCount=0;
  while (byteCount < length) {
    if (one[byteCount] != two[byteCount]) {
      return false;
    }
    ++byteCount;
  }
  return true;
}
  boolean __target__(byte[] one,byte[] two){
  if ((one == null) || (two == null)) {
    return false;
  }
  if (one.length != two.length) {
    return false;
  }
  int length=one.length;
  int byteCount=0;
  while (byteCount < length) {
    if (one[byteCount] == two[byteCount]) {
      return false;
    }
    ++byteCount;
  }
  return true;
}

}