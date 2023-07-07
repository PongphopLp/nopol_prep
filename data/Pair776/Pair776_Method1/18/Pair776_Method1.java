import java.util.*;

public class Target {

String encodeHexStr(byte[] buf,int pos,int len){
  StringBuffer hex=new StringBuffer();
  while (len-- > 0) {
    byte ch=buf[pos++];
    int d=(ch >> 4) & 0xf;
    hex.append((char)(d >= 10 ? 'a' - 10 + d : '0' + d));
    d=ch & 0xf;
    hex.append((char)(d >= 10 ? 'a' - 10 + d : '0' + d));
  }
  return hex.toString();
}
  String __target__(byte[] buf,int pos,int len){
  StringBuffer hex=new StringBuffer();
  while (len-- > 0) {
    byte ch=buf[pos++];
    int d=(ch >> 4) & 0xf;
    hex.append((char)(d >= 10 ? 'a' - 10 + d : '0' + d));
    d=ch & 0xf;
    hex.append((char)(d >= 10 ? 'a' + 10 + d : '0' + d));
  }
  return hex.toString();
}

}