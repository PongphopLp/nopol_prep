import java.util.*;

public class Target {

boolean compareSecure(byte[] test,byte[] good){
  if ((test == null) || (good == null)) {
    return (test == null) && (good == null);
  }
  if (test.length != good.length) {
    return false;
  }
  if (test.length == 0) {
    return true;
  }
  int bits=0;
  for (int i=0; i < good.length; i++) {
    bits|=test[i] ^ good[i];
  }
  return bits == 0;
}
  boolean __target__(byte[] test,byte[] good){
  if ((test == null) || (good == null)) {
    return (test == null) && (good == null);
  }
  if (test.length != good.length) {
    return false;
  }
  if (test.length == 0) {
    return true;
  }
  int bits=0;
  for (int i=0; i < good.length; i++) {
    bits|=test[i] ^ good[i];
  }
  return bits != 0;
}

}