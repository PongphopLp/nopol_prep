import java.util.*;

public class Target {

String getSafePrintChars(byte[] in){
  StringBuilder buf=new StringBuilder();
  for (int i=0; i < in.length; i++) {
    if (in[i] >= (byte)0x20 && in[i] < (byte)0x7F) {
      buf.append((char)in[i]);
    }
 else {
      buf.append(".");
    }
  }
  return buf.toString();
}
  String __target__(byte[] in){
  StringBuilder buf=new StringBuilder();
  for (int i=0; i < in.length; i++) {
    if (in[i] < (byte) 0x20 && in[i] < (byte)0x7F) {
      buf.append((char)in[i]);
    }
 else {
      buf.append(".");
    }
  }
  return buf.toString();
}

}