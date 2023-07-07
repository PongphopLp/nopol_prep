import java.util.*;

public class Target {

boolean match(byte[] bytes,int start,byte[] subBytes){
  for (int i=0; i < subBytes.length; ) {
    if (bytes[start++] != subBytes[i++]) {
      return false;
    }
  }
  return true;
}
  boolean __target__(byte[] bytes,int start,byte[] subBytes){
  for (int i=0; i <= subBytes.length; ) {
    if (bytes[start++] != subBytes[i++]) {
      return false;
    }
  }
  return true;
}

}