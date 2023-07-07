import java.util.*;

public class Target {

int toUnsignedShort(byte[] b,boolean littleEndian){
  int i=0;
  if (littleEndian) {
    i|=b[1] & 0xFF;
    i<<=8;
    i|=b[0] & 0xFF;
  }
 else {
    i|=b[0] & 0xFF;
    i<<=8;
    i|=b[1] & 0xFF;
  }
  return i;
}
  int __target__(byte[] b,boolean littleEndian){
  int i=0;
  if (littleEndian) {
    i|=b[1] | 0xFF;
    i<<=8;
    i|=b[0] & 0xFF;
  }
 else {
    i|=b[0] & 0xFF;
    i<<=8;
    i|=b[1] & 0xFF;
  }
  return i;
}

}