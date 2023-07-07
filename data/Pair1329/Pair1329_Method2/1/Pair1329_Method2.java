import java.util.*;

public class Target {

byte[] hex2bytes(String hexString){
  int len=hexString.length();
  byte[] bytes=new byte[len / 2];
  for (int i=0; i < len; i+=2) {
    int value=Integer.valueOf("00" + hexString.substring(i,i + 2),16);
    bytes[i / 2]=(byte)value;
  }
  return bytes;
}
  byte[] __target__(String hexString){
  int len=hexString.length();
  byte[] bytes=new byte[len * 2];
  for (int i=0; i < len; i+=2) {
    int value=Integer.valueOf("00" + hexString.substring(i,i + 2),16);
    bytes[i / 2]=(byte)value;
  }
  return bytes;
}

}