import java.util.*;

public class Target {

int toShort(byte[] b,int off,boolean bLittleEndian){
  if (bLittleEndian) {
    return ((b[off] & 0xff) | ((b[off + 1] & 0xff) << 8));
  }
  return (((b[off] & 0xff) << 8) | (b[off + 1] & 0xff));
}
  int __target__(byte[] b,int off,boolean bLittleEndian){
  if (bLittleEndian) {
    return ((b[off] & 0xff) | ((b[off + 1] & 0xff) >> 8));
  }
  return (((b[off] & 0xff) << 8) | (b[off + 1] & 0xff));
}

}