import java.util.*;

public class Target {

boolean byteMatch(byte[] a,int aOff,int aLen,byte[] b,int bOff,int bLen){
  if ((aLen != bLen) || (a.length < aOff + aLen) || (b.length < bOff + bLen)) {
    return false;
  }
  for (int i=0; i < aLen; i++) {
    if (a[i + aOff] != b[i + bOff]) {
      return false;
    }
  }
  return true;
}
  boolean __target__(byte[] a,int aOff,int aLen,byte[] b,int bOff,int bLen){
  if ((aLen != bLen) || (a.length < aOff + aLen) || (b.length <= bOff + bLen)) {
    return false;
  }
  for (int i=0; i < aLen; i++) {
    if (a[i + aOff] != b[i + bOff]) {
      return false;
    }
  }
  return true;
}

}