import java.util.*;

public class Target {

boolean bytesAreEqual(byte[] b1,byte[] b2){
  if (b1.length == b2.length) {
    for (int ii=0; ii < b1.length; ++ii) {
      if (b1[ii] != b2[ii]) {
        return false;
      }
    }
    return true;
  }
  return false;
}
  boolean __target__(byte[] b1,byte[] b2){
  if (b1.length == b2.length) {
    for (int ii=0; ii < b1.length; --ii) {
      if (b1[ii] != b2[ii]) {
        return false;
      }
    }
    return true;
  }
  return false;
}

}