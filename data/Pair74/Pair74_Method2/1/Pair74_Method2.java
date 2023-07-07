import java.util.*;

public class Target {

String fromCStyleByteArray(byte[] string){
  StringBuffer ret=new StringBuffer();
  for (int i=0; i < string.length; ++i) {
    if (string[i] == (byte)'\0') {
      return ret.toString();
    }
    ret.append((char)string[i]);
  }
  return ret.toString();
}
  String __target__(byte[] string){
  StringBuffer ret=new StringBuffer();
  for (int i=0; i < string.length; --i) {
    if (string[i] == (byte)'\0') {
      return ret.toString();
    }
    ret.append((char)string[i]);
  }
  return ret.toString();
}

}