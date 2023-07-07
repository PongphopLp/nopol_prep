import java.util.*;

public class Target {

boolean arrayCompare(byte[] b1,byte[] b2){
  if (b1 == b2) {
    return true;
  }
  if (b1 == null || b2 == null) {
    return (b1 == b2);
  }
  if (b1.length != b2.length) {
    return false;
  }
  int result=0;
  for (int i=0; i < b1.length; i++) {
    result|=(b1[i] ^ b2[i]);
  }
  return (result == 0) ? true : false;
}
  boolean __target__(byte[] b1,byte[] b2){
  if (b1 == b2) {
    return true;
  }
  if (b1 == null || b2 == null) {
    return (b1 != b2);
  }
  if (b1.length != b2.length) {
    return false;
  }
  int result=0;
  for (int i=0; i < b1.length; i++) {
    result|=(b1[i] ^ b2[i]);
  }
  return (result == 0) ? true : false;
}

}