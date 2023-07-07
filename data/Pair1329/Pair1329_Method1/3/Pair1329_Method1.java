import java.util.*;

public class Target {

byte[] BytearrayFromStringAsHex(String hexString){
  int len=hexString.length();
  byte[] bytearray=new byte[len / 2];
  for (int i=0; i < len; i+=2) {
    String nstring="0x" + hexString.substring(i,i + 2);
    int ascii=Integer.decode(nstring);
    bytearray[i / 2]=(byte)ascii;
  }
  return bytearray;
}
  byte[] __target__(String hexString){
  int len=hexString.length();
  byte[] bytearray=new byte[len / 2];
  for (int i=0; i < len; i+=2) {
    String nstring="0x" + hexString.substring(i,i - 2);
    int ascii=Integer.decode(nstring);
    bytearray[i / 2]=(byte)ascii;
  }
  return bytearray;
}

}