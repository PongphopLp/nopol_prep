import java.util.*;

public class Target {

String getString(byte[] data,int offset){
  StringBuffer buffer=new StringBuffer();
  char c;
  for (int loop=0; offset + loop < data.length; loop++) {
    c=(char)data[offset + loop];
    if (c == 0) {
      break;
    }
    buffer.append(c);
  }
  return (buffer.toString());
}
  String __target__(byte[] data,int offset){
  StringBuffer buffer=new StringBuffer();
  char c;
  for (int loop=0; offset + loop < data.length; loop++) {
    c=(char)data[offset + loop];
    if (c == 0) {
      break;
    }
  }
  return (buffer.toString());
}

}