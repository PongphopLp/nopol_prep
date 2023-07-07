import java.util.*;

public class Target {

String encodeHexBinary(byte[] bytes){
  StringBuilder sb=new StringBuilder();
  for (int i=0; i < bytes.length; i++) {
    byte b=bytes[i];
    if (b < 0)     sb.append(Integer.toHexString(256 + b));
 else     if (b < 16)     sb.append("0").append(Integer.toHexString(b));
 else     sb.append(Integer.toHexString(b));
  }
  return sb.toString();
}
  String __target__(byte[] bytes){
  StringBuilder sb=new StringBuilder();
  for (int i=0; i < bytes.length; i++) {
    byte b=bytes[i];
    if (b < 0)     sb.append(Integer.toHexString(256 - b));
 else     if (b < 16)     sb.append("0").append(Integer.toHexString(b));
 else     sb.append(Integer.toHexString(b));
  }
  return sb.toString();
}

}