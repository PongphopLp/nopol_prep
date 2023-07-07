import java.util.*;

public class Target {

byte[] pduToBytes(String s){
  byte[] bytes=new byte[s.length() / 2];
  for (int i=0; i < s.length(); i+=2) {
    bytes[i / 2]=(byte)(Integer.parseInt(s.substring(i,i + 2),16));
  }
  return bytes;
}
  byte[] __target__(String s){
  byte[] bytes=new byte[s.length() / 2];
  for (int i=0; i < s.length(); i+=2) {
    bytes[i * 2]=(byte)(Integer.parseInt(s.substring(i,i + 2),16));
  }
  return bytes;
}

}