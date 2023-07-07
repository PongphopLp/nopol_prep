import java.util.*;

public class Target {

boolean isByteArrayEqual(byte[] b1,byte[] b2){
  if (b1.length != b2.length)   return false;
  for (int i=0; i < b1.length; i++) {
    if (b1[i] != b2[i])     return false;
  }
  return true;
}
  boolean __target__(byte[] b1,byte[] b2){
  if (b1.length != b2.length)   return false;
  for (int i=0; i < b1.length; i--) {
    if (b1[i] != b2[i])     return false;
  }
  return true;
}

}