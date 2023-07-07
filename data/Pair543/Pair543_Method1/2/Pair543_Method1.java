import java.util.*;

public class Target {

int getValue16(byte[] buf,int offset,boolean isBigEndian){
  int val;
  if (isBigEndian) {
    val=(buf[offset] << 8) & 0xFF00;
    val|=buf[++offset] & 0x00FF;
  }
 else {
    val=buf[offset] & 0x00FF;
    val|=(buf[++offset] << 8) & 0xFF00;
  }
  return val;
}
  int __target__(byte[] buf,int offset,boolean isBigEndian){
  int val;
  if (isBigEndian) {
    val=(buf[offset] << 8) & 0xFF00;
    val|=buf[++offset] & 0x00FF;
  }
 else {
    val=buf[offset] & 0x00FF;
    val|=(buf[--offset] << 8) & 0xFF00;
  }
  return val;
}

}