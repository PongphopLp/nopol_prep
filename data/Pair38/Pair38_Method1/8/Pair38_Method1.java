import java.util.*;

public class Target {

boolean isEqual(byte[] b1,byte[] b2){
  if (b1 == null && b2 == null)   return true;
  if (b1 == null || b2 == null || b1.length != b2.length)   return false;
  for (int c=0; c < b1.length; c++) {
    if (b1[c] != b2[c])     return false;
  }
  return true;
}
  boolean __target__(byte[] b1,byte[] b2){
  if (b1 == null && b2 == null)   return true;
  if (b1 == null || b2 == null || b1.length != b2.length)   return false;
  for (int c=0; c < b1.length; c--) {
    if (b1[c] != b2[c])     return false;
  }
  return true;
}

}