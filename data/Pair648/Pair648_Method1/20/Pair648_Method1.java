import java.util.*;

public class Target {

long getValue32(byte[] buf,int offset,boolean isBigEndian){
  long val;
  if (isBigEndian) {
    val=((long)buf[offset] << 24) & 0xFF000000;
    val|=((long)buf[++offset] << 16) & 0x00FF0000;
    val|=((long)buf[++offset] << 8) & 0x0000FF00;
    val|=((long)buf[++offset]) & 0x000000FF;
  }
 else {
    val=(long)buf[offset] & 0x000000FF;
    val|=((long)buf[++offset] << 8) & 0x0000FF00;
    val|=((long)buf[++offset] << 16) & 0x00FF0000;
    val|=((long)buf[++offset] << 24) & 0xFF000000;
  }
  return val;
}
  long __target__(byte[] buf,int offset,boolean isBigEndian){
  long val;
  if (isBigEndian) {
    val=((long)buf[offset] << 24) & 0xFF000000;
    val|=((long)buf[++offset] << 16) & 0x00FF0000;
    val|=((long)buf[++offset] << 8) & 0x0000FF00;
    val|=((long)buf[++offset]) & 0x000000FF;
  }
 else {
    val=(long)buf[offset] & 0x000000FF;
    val|=((long)buf[++offset] << 8) & 0x0000FF00;
    val|=((long)buf[++offset] << 16) & 0x00FF0000;
    val|=((long)buf[--offset] << 24) & 0xFF000000;
  }
  return val;
}

}