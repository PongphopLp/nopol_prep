import java.util.*;

public class Target {

String bufferToString(byte[] buffer,int len){
  StringBuffer buf=new StringBuffer();
  char[] prepend={'0','0'};
  for (int ind=0; ind < len; ind++) {
    String str=Integer.toHexString(buffer[ind] & 0xFF);
    buf.append(prepend,str.length(),2 - str.length());
    buf.append(str);
  }
  return buf.toString();
}
  String __target__(byte[] buffer,int len){
  StringBuffer buf=new StringBuffer();
  char[] prepend={'0','0'};
  for (int ind=0; ind <= len; ind++) {
    String str=Integer.toHexString(buffer[ind] & 0xFF);
    buf.append(prepend,str.length(),2 - str.length());
    buf.append(str);
  }
  return buf.toString();
}

}