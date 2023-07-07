import java.util.*;

public class Target {

boolean bytesEqual(byte[] buf1,byte[] buf2,int off,int len){
  for (int i=off; i < off + len; i++) {
    if (i >= buf1.length || i >= buf2.length) {
      return false;
    }
    if (buf1[i] != buf2[i]) {
      return false;
    }
  }
  return true;
}
  boolean __target__(byte[] buf1,byte[] buf2,int off,int len){
  for (int i=off; i < off + len; i++) {
    if (i < buf1.length || i >= buf2.length) {
      return false;
    }
    if (buf1[i] != buf2[i]) {
      return false;
    }
  }
  return true;
}

}