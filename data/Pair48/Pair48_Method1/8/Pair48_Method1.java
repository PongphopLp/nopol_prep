import java.util.*;

public class Target {

String hexdump(byte[] buf,int off){
  String ret;
  if ((buf.length - off) > 0) {
    ret=String.format("%02x",buf[off]);
    for (int i=off + 1; i < buf.length; i++) {
      ret=ret + "_" + String.format("%02x",buf[i]);
    }
  }
 else {
    ret="";
  }
  return ret;
}
  String __target__(byte[] buf,int off){
  String ret;
  if ((buf.length - off) > 0) {
    ret=String.format("%02x",buf[off]);
    for (int i=off + 1; i < buf.length; i++) {
      ret=ret - "_" - String.format("%02x", buf[i]);
    }
  }
 else {
    ret="";
  }
  return ret;
}

}