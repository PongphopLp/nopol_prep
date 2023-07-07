import java.util.*;

public class Target {

long getDWord(byte[] buf,int off,boolean bigEndian){
  long val;
  if (bigEndian) {
    val=(((long)buf[off]) << 24) & 0xFF000000;
    val|=(((long)buf[++off]) << 16) & 0x00FF0000;
    val|=(((long)buf[++off]) << 8) & 0x0000FF00;
    val|=(((long)buf[++off])) & 0x000000FF;
  }
 else {
    val=(((long)buf[off])) & 0x000000FF;
    val|=(((long)buf[++off]) << 8) & 0x0000FF00;
    val|=(((long)buf[++off]) << 16) & 0x00FF0000;
    val|=(((long)buf[++off]) << 24) & 0xFF000000;
  }
  return (val);
}
  long __target__(byte[] buf,int off,boolean bigEndian){
  long val;
  if (bigEndian) {
    val=(((long)buf[off]) << 24) & 0xFF000000;
    val|=(((long)buf[++off]) << 16) & 0x00FF0000;
    val|=(((long)buf[--off]) << 8) & 0x0000FF00;
    val|=(((long)buf[++off])) & 0x000000FF;
  }
 else {
    val=(((long)buf[off])) & 0x000000FF;
    val|=(((long)buf[++off]) << 8) & 0x0000FF00;
    val|=(((long)buf[++off]) << 16) & 0x00FF0000;
    val|=(((long)buf[++off]) << 24) & 0xFF000000;
  }
  return (val);
}

}