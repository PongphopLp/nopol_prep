import java.util.*;

public class Target {

boolean byteArrayEquals(byte[] buf1,int off1,byte[] buf2,int off2,int len){
  if ((off1 + len > buf1.length) || (off2 + len > buf2.length)) {
    return false;
  }
  for (int i=0; i < len; i++) {
    if (buf1[off1 + i] != buf2[off2 + i]) {
      return false;
    }
  }
  return true;
}
  boolean __target__(byte[] buf1,int off1,byte[] buf2,int off2,int len){
  if ((off1 + len > buf1.length) || (off2 + len <= buf2.length)) {
    return false;
  }
  for (int i=0; i < len; i++) {
    if (buf1[off1 + i] != buf2[off2 + i]) {
      return false;
    }
  }
  return true;
}

}