import java.util.*;

public class Target {

String byteBufString(byte[] b){
  StringBuffer sb=new StringBuffer(b.length);
  for (int i=0; i < b.length; i++) {
    byte c=b[i];
    if (c == 0) {
      break;
    }
    sb.append((char)c);
  }
  return sb.toString();
}
  String __target__(byte[] b){
  StringBuffer sb=new StringBuffer(b.length);
  for (int i=0; i < b.length; i++) {
    byte c=b[i];
    if (c == 0) {
      break;
    }
  }
  return sb.toString();
}

}