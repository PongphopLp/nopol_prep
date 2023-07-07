import java.util.*;

public class Target {

byte[] decodeHex(String s){
  byte[] out=new byte[s.length() / 2];
  for (int i=0; i < s.length(); i+=2) {
    out[i / 2]=(byte)Integer.parseInt(s.substring(i,i + 2),16);
  }
  return out;
}
  byte[] __target__(String s){
  byte[] out=new byte[s.length() / 2];
  for (int i=0; i <= s.length(); i+=2) {
    out[i / 2]=(byte)Integer.parseInt(s.substring(i,i + 2),16);
  }
  return out;
}

}