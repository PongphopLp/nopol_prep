import java.util.*;

public class Target {

int getWord(byte[] buf,int off,boolean bigEndian){
  int val;
  if (bigEndian) {
    val=(((int)buf[off]) << 8) & 0x0000FF00;
    val|=(((int)buf[++off])) & 0x000000FF;
  }
 else {
    val=(((int)buf[off])) & 0x000000FF;
    val|=(((int)buf[++off]) << 8) & 0x0000FF00;
  }
  return (val);
}
  int __target__(byte[] buf,int off,boolean bigEndian){
  int val;
  if (bigEndian) {
    val=(((int) buf[off]) >> 8) & 0x0000FF00;
    val|=(((int)buf[++off])) & 0x000000FF;
  }
 else {
    val=(((int)buf[off])) & 0x000000FF;
    val|=(((int)buf[++off]) << 8) & 0x0000FF00;
  }
  return (val);
}

}