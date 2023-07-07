import java.util.*;

public class Target {

String bytesToString(byte[] bytes){
  StringBuffer sb=new StringBuffer();
  String s;
  int i;
  for (i=0; i < bytes.length; i++) {
    if (i % 32 == 0 && i != 0)     sb.append("\n");
    s=Integer.toHexString(bytes[i]);
    if (s.length() < 2)     s="0" + s;
    if (s.length() > 2)     s=s.substring(s.length() - 2);
    sb.append(s);
  }
  return sb.toString();
}
  String __target__(byte[] bytes){
  StringBuffer sb=new StringBuffer();
  String s;
  int i;
  for (i=0; i < bytes.length; i++) {
    if (i % 32 == 0 && i != 0)     sb.append("\n");
    s=Integer.toHexString(bytes[i]);
    if (s.length() < 2)     s="0" + s;
    if (s.length() > 2)     s=s.substring(s.length() - 2);
  }
  return sb.toString();
}

}