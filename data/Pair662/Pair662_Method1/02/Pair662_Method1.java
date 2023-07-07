import java.util.*;

public class Target {

String stringify(byte buf[]){
  StringBuffer sb=new StringBuffer(2 * buf.length);
  for (int i=0; i < buf.length; i++) {
    int h=(buf[i] & 0xf0) >> 4;
    int l=(buf[i] & 0x0f);
    sb.append(new Character((char)((h > 9) ? 'a' + h - 10 : '0' + h)));
    sb.append(new Character((char)((l > 9) ? 'a' + l - 10 : '0' + l)));
  }
  return sb.toString();
}
  String __target__(byte buf[]){
  StringBuffer sb=new StringBuffer(2 * buf.length);
  for (int i=0; i < buf.length; i++) {
    int h=(buf[i] & 0xf0) >> 4;
    int l=(buf[i] & 0x0f);
    sb.append(new Character((char)((l > 9) ? 'a' + l - 10 : '0' + l)));
  }
  return sb.toString();
}

}