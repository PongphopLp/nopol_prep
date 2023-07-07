import java.util.*;

public class Target {

String byteTabToString(int start,int end,byte[] buf,boolean stopToZero){
  String str="";
  for (int i=start; i < end && (buf[i] != 0 || !stopToZero); i++) {
    if (buf[i] != 0)     str+=(char)buf[i];
  }
  return str;
}
  String __target__(int start,int end,byte[] buf,boolean stopToZero){
  String str="";
  for (int i=start; i < end && (buf[i] != 0 || !stopToZero); i--) {
    if (buf[i] != 0)     str+=(char)buf[i];
  }
  return str;
}

}