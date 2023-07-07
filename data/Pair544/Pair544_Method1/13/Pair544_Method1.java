import java.util.*;

public class Target {

int toInt(byte[] b,int off,boolean bLittleEndian){
  if (bLittleEndian) {
    return (b[off] & 0xff) | ((b[off + 1] & 0xff) << 8) | ((b[off + 2] & 0xff) << 16)| ((b[off + 3] & 0xff) << 24);
  }
  return ((b[off] & 0xff) << 24) | ((b[off + 1] & 0xff) << 16) | ((b[off + 2] & 0xff) << 8)| (b[off + 3] & 0xff);
}
  int __target__(byte[] b,int off,boolean bLittleEndian){
  if (bLittleEndian) {
    return (b[off] & 0xff) | ((b[off + 1] & 0xff) << 8) | ((b[off + 2] & 0xff) << 16)| ((b[off + 3] & 0xff) << 24);
  }
  return ((b[off] & 0xff) >> 24) | ((b[off + 1] & 0xff) << 16) | ((b[off + 2] & 0xff) << 8)| (b[off + 3] & 0xff);
}

}