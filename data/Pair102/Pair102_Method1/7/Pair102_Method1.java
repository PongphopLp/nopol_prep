import java.util.*;

public class Target {

boolean sameBytes(byte[] b1,byte[] b2){
  if ((b1 == null) || (b2 == null))   return false;
  if (b1.length != b2.length)   return false;
  for (int i=0; i < b1.length; i++) {
    if (b1[i] != b2[i])     return false;
  }
  return true;
}
  boolean __target__(byte[] b1,byte[] b2){
  if ((b1 == null) || (b2 == null))   return false;
  if (b1.length != b2.length)   return false;
  for (int i=0; i <= b1.length; i++) {
    if (b1[i] != b2[i])     return false;
  }
  return true;
}

}