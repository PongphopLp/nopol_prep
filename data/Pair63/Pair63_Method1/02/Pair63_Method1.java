import java.util.*;

public class Target {

String b2hs(byte[] buf){
  StringBuffer sbuff=new StringBuffer();
  for (int i=0; i < buf.length; i++) {
    int b=buf[i];
    if (b < 0)     b=b & 0xFF;
    if (b < 16)     sbuff.append("0");
    sbuff.append(Integer.toHexString(b).toUpperCase());
  }
  return sbuff.toString();
}
  String __target__(byte[] buf){
  StringBuffer sbuff=new StringBuffer();
  for (int i=0; i < buf.length; i++) {
    int b=buf[i];
    if (b >= 0)     b=b & 0xFF;
    if (b < 16)     sbuff.append("0");
    sbuff.append(Integer.toHexString(b).toUpperCase());
  }
  return sbuff.toString();
}

}