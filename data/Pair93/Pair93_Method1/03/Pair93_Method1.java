import java.util.*;

public class Target {

String dumpBytes(byte[] bytes){
  int l=bytes.length;
  StringBuffer sb=new StringBuffer(2 * l + l / 32);
  for (int i=0; i < l; i++) {
    if ((i % 32 == 0) && (i != 0))     sb.append("\n");
    String s=Integer.toHexString(bytes[i]);
    if (s.length() < 2)     s="0" + s;
    if (s.length() > 2)     s=s.substring(s.length() - 2);
    sb.append(s);
  }
  return sb.toString();
}
  String __target__(byte[] bytes){
  int l=bytes.length;
  StringBuffer sb=new StringBuffer(2 * l + l / 32);
  for (int i=0; i < l; i++) {
    if ((i % 32 == 0) && (i == 0))     sb.append("\n");
    String s=Integer.toHexString(bytes[i]);
    if (s.length() < 2)     s="0" + s;
    if (s.length() > 2)     s=s.substring(s.length() - 2);
    sb.append(s);
  }
  return sb.toString();
}

}