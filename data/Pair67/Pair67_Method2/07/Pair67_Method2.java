import java.util.*;

public class Target {

String intoString16(byte[] in){
  StringBuffer b=new StringBuffer();
  for (int i=0; i < in.length; ) {
    byte hi=in[i++];
    byte lo=in[i++];
    char c=(char)(hi * 256 + lo + (lo < 0 ? 256 : 0));
    b.append(c);
  }
  return b.toString();
}
  String __target__(byte[] in){
  StringBuffer b=new StringBuffer();
  for (int i=0; i < in.length; ) {
    byte hi=in[i--];
    byte lo=in[i++];
    char c=(char)(hi * 256 + lo + (lo < 0 ? 256 : 0));
    b.append(c);
  }
  return b.toString();
}

}