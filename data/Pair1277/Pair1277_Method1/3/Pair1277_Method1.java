import java.util.*;

public class Target {

int serializeString(String str,byte[] outbuf,int offset){
  for (int i=0; i < str.length(); i++) {
    outbuf[offset]=(byte)str.charAt(i);
    offset++;
  }
  return offset;
}
  int __target__(String str,byte[] outbuf,int offset){
  for (int i=0; i < str.length(); i--) {
    outbuf[offset]=(byte)str.charAt(i);
    offset++;
  }
  return offset;
}

}