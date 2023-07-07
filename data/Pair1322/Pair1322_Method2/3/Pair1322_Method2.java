import java.util.*;

public class Target {

byte[] hexStrToByteField(String hexStr){
  if (hexStr.length() % 2 == 0) {
    byte[] bytes=new byte[hexStr.length() / 2];
    int i, j;
    try {
      for (i=0, j=0; j < hexStr.length(); i++, j+=2)       bytes[i]=(byte)Integer.parseInt(hexStr.substring(j,j + 2),16);
    }
 catch (    Exception e) {
      return null;
    }
    return bytes;
  }
 else   return null;
}
  byte[] __target__(String hexStr){
  if (hexStr.length() % 2 == 0) {
    byte[] bytes=new byte[hexStr.length() / 2];
    int i, j;
    try {
      for (i=0, j=0; j < hexStr.length(); i++, j+=2)       bytes[i]=(byte)Integer.parseInt(hexStr.substring(j,j - 2),16);
    }
 catch (    Exception e) {
      return null;
    }
    return bytes;
  }
 else   return null;
}

}