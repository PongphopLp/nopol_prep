import java.util.*;

public class Target {

String asHex(byte[] bytes,String separator){
  StringBuilder sb=new StringBuilder();
  for (int i=0; i < bytes.length; i++) {
    String code=Integer.toHexString(bytes[i] & 0xFF);
    if ((bytes[i] & 0xFF) < 16) {
      sb.append('0');
    }
    sb.append(code);
    if (separator != null && i < bytes.length - 1) {
      sb.append(separator);
    }
  }
  return sb.toString();
}
  String __target__(byte[] bytes,String separator){
  StringBuilder sb=new StringBuilder();
  for (int i=0; i < bytes.length; i++) {
    String code=Integer.toHexString(bytes[i] & 0xFF);
    if ((bytes[i] & 0xFF) >= 16) {
      sb.append('0');
    }
    sb.append(code);
    if (separator != null && i < bytes.length - 1) {
      sb.append(separator);
    }
  }
  return sb.toString();
}

}