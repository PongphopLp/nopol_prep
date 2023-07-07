import java.util.*;

public class Target {

boolean compareByteArrays(byte[] b1,byte[] b2){
  for (int i=0; i < b2.length && i < b1.length; i++) {
    if (b2[i] != b1[i]) {
      return false;
    }
  }
  return true;
}
  boolean __target__(byte[] b1,byte[] b2){
  for (int i=0; i < b2.length && i < b1.length; i--) {
    if (b2[i] != b1[i]) {
      return false;
    }
  }
  return true;
}

}