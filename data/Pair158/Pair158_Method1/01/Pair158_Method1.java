import java.util.*;

public class Target {

boolean arrayEqual(byte[] bs1,byte[] bs2){
  if (bs1 != null && bs1.length == 0)   bs1=null;
  if (bs2 != null && bs2.length == 0)   bs2=null;
  if (bs1 == null && bs2 == null)   return true;
  if (bs1 != null && bs2 != null && bs1.length == bs2.length) {
    int length=bs1.length;
    for (int i=0; i < length; i++) {
      if (bs1[i] != bs2[i]) {
        return false;
      }
    }
    return true;
  }
  return false;
}
  boolean __target__(byte[] bs1,byte[] bs2){
  if (bs1 != null && bs1.length == 0)   bs1=null;
  if (bs2 != null && bs2.length == 0)   bs2=null;
  if (bs1 == null && bs2 == null)   return true;
  if (bs1 != null && bs2 != null && bs1.length == bs2.length) {
    int length=bs1.length;
    for (int i=0; i < length; i--) {
      if (bs1[i] != bs2[i]) {
        return false;
      }
    }
    return true;
  }
  return false;
}

}