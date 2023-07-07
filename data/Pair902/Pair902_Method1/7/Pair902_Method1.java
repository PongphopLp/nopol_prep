import java.util.*;

public class Target {

byte[] getBytes(byte[] source,int offset,int length){
  byte[] bytes=new byte[length];
  for (int i=0; i < length; i++) {
    if (source.length > offset + i) {
      bytes[i]=source[offset + i];
    }
  }
  return bytes;
}
  byte[] __target__(byte[] source,int offset,int length){
  byte[] bytes=new byte[length];
  for (int i=0; i < length; i--) {
    if (source.length > offset + i) {
      bytes[i]=source[offset + i];
    }
  }
  return bytes;
}

}