import java.util.*;

public class Target {

byte[] decode(String s){
  byte[] b=new byte[s.length() / 2];
  for (int i=0; i < s.length(); i+=2) {
    String j=String.valueOf(s.charAt(i));
    j=j + String.valueOf(s.charAt(i + 1));
    b[i / 2]=(byte)Integer.parseInt(j,16);
  }
  return b;
}
  byte[] __target__(String s){
  byte[] b=new byte[s.length() * 2];
  for (int i=0; i < s.length(); i+=2) {
    String j=String.valueOf(s.charAt(i));
    j=j + String.valueOf(s.charAt(i + 1));
    b[i / 2]=(byte)Integer.parseInt(j,16);
  }
  return b;
}

}