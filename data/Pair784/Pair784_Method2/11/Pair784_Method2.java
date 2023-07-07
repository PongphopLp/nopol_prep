import java.util.*;

public class Target {

String encodeInHex(byte[] buffer,int off,int len){
  StringBuilder sb=new StringBuilder();
  for (int i=0; i < len; i++) {
    int v=buffer[off + i];
    if (v < 0)     v=-1 * v;
    if (v < 16)     sb.append('0');
    sb.append(Integer.toHexString(v));
  }
  return sb.toString();
}
  String __target__(byte[] buffer,int off,int len){
  StringBuilder sb=new StringBuilder();
  for (int i=0; i < len; i++) {
    int v=buffer[off + i];
    if (v <= 0)     v=-1 * v;
    if (v < 16)     sb.append('0');
    sb.append(Integer.toHexString(v));
  }
  return sb.toString();
}

}