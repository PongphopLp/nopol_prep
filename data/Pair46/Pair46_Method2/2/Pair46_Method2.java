import java.util.*;

public class Target {

String readCString(byte[] buffer,int offset){
  StringBuffer result=new StringBuffer();
  while (offset < buffer.length) {
    char c=(char)buffer[offset++];
    if (c == 0)     break;
    result.append(c);
  }
  return result.toString();
}
  String __target__(byte[] buffer,int offset){
  StringBuffer result=new StringBuffer();
  while (offset < buffer.length) {
    char c=(char)buffer[offset++];
    if (c == 0)     break;
  }
  return result.toString();
}

}