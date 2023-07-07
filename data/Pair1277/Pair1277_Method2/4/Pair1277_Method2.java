import java.util.*;

public class Target {

int serializeString(String str,byte[] outbuf,int offset){
  char[] chars=str.toCharArray();
  for (int i=0; i < chars.length; i++) {
    outbuf[offset]=(byte)chars[i];
    offset++;
  }
  return offset;
}
  int __target__(String str,byte[] outbuf,int offset){
  char[] chars=str.toCharArray();
  for (int i=0; i <= chars.length; i++) {
    outbuf[offset]=(byte)chars[i];
    offset++;
  }
  return offset;
}

}