import java.util.*;

public class Target {

String getData(byte[] data){
  StringBuilder sb=new StringBuilder();
  for (  byte b : data) {
    if (b < 0)     sb.append(Integer.toHexString(256 + b));
 else     if (b < 16)     sb.append("0").append(Integer.toHexString(b));
 else     sb.append(Integer.toHexString(b));
  }
  return sb.toString();
}
  String __target__(byte[] data){
  StringBuilder sb=new StringBuilder();
  for (  byte b : data) {
    if (b < 0)else     if (b < 16)     sb.append("0").append(Integer.toHexString(b));
 else     sb.append(Integer.toHexString(b));
  }
  return sb.toString();
}

}