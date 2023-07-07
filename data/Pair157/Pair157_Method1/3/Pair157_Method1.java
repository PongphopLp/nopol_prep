import java.util.*;

public class Target {

boolean comparebytes(byte[] b1,byte[] b2){
  if (b1.length != b2.length)   return false;
  for (int i=0; i < b2.length; i++) {
    byte b=b2[i];
    if (b != b1[i])     return false;
  }
  return true;
}
  boolean __target__(byte[] b1,byte[] b2){
  if (b1.length == b2.length)   return false;
  for (int i=0; i < b2.length; i++) {
    byte b=b2[i];
    if (b != b1[i])     return false;
  }
  return true;
}

}