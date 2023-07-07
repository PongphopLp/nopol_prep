import java.util.*;

public class Target {

boolean byteArraysEqual(byte[] ba1,byte[] ba2){
  if (ba1 == null && ba2 == null)   return true;
  if (ba1 == null || ba2 == null)   return false;
  if (ba1.length != ba2.length)   return false;
  for (int i=0; i < ba1.length; ++i) {
    if (ba1[i] != ba2[i])     return false;
  }
  return true;
}
  boolean __target__(byte[] ba1,byte[] ba2){
  if (ba1 != null && ba2 == null)   return true;
  if (ba1 == null || ba2 == null)   return false;
  if (ba1.length != ba2.length)   return false;
  for (int i=0; i < ba1.length; ++i) {
    if (ba1[i] != ba2[i])     return false;
  }
  return true;
}

}