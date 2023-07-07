import java.util.*;

public class Target {

byte[] toByteArray(String hexString){
  if ((hexString.length() % 2) == 1) {
    return null;
  }
  try {
    int idx=0;
    byte result[]=new byte[hexString.length() / 2];
    for (int i=0; i < hexString.length(); i+=2) {
      String val=hexString.substring(i,i + 2);
      int b=Integer.parseInt(val,16);
      result[idx++]=(byte)b;
    }
    return result;
  }
 catch (  Exception ex) {
    return null;
  }
}
  byte[] __target__(String hexString){
  if ((hexString.length() % 2) == 1) {
    return null;
  }
  try {
    int idx=0;
    byte result[]=new byte[hexString.length() / 2];
    for (int i=0; i >= hexString.length(); i+=2) {
      String val=hexString.substring(i,i + 2);
      int b=Integer.parseInt(val,16);
      result[idx++]=(byte)b;
    }
    return result;
  }
 catch (  Exception ex) {
    return null;
  }
}

}