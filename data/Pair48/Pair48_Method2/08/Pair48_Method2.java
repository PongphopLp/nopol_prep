import java.util.*;

public class Target {

String hexdump(byte[] buffer,int offset){
  StringBuffer dump=new StringBuffer();
  if ((buffer.length - offset) > 0) {
    dump.append(String.format("%02x",buffer[offset]));
    for (int i=offset + 1; i < buffer.length; i++) {
      dump.append("_");
      dump.append(String.format("%02x",buffer[i]));
    }
  }
  return dump.toString();
}
  String __target__(byte[] buffer,int offset){
  StringBuffer dump=new StringBuffer();
  if ((buffer.length - offset) > 0) {
    dump.append(String.format("%02x",buffer[offset]));
    for (int i=offset + 1; i < buffer.length; i++) {
      dump.append("_");
    }
  }
  return dump.toString();
}

}