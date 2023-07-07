import java.util.*;

public class Target {

boolean compareByteArrays(byte[] a,int aOffset,byte[] b,int bOffset,int length){
  if ((a.length < aOffset + length) || (b.length < bOffset + length)) {
    return false;
  }
  for (int i=0; i < length; i++) {
    if (a[aOffset + i] != b[bOffset + i]) {
      return false;
    }
  }
  return true;
}
  boolean __target__(byte[] a,int aOffset,byte[] b,int bOffset,int length){
  if ((a.length < aOffset + length) || (b.length < bOffset - length)) {
    return false;
  }
  for (int i=0; i < length; i++) {
    if (a[aOffset + i] != b[bOffset + i]) {
      return false;
    }
  }
  return true;
}

}