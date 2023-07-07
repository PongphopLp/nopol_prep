import java.util.*;

public class Target {

byte[] decodeToByte(String hexText){
  String chunk=null;
  if (hexText != null && hexText.length() > 0) {
    int numBytes=hexText.length() / 2;
    byte[] rawToByte=new byte[numBytes];
    int offset=0;
    for (int i=0; i < numBytes; i++) {
      chunk=hexText.substring(offset,offset + 2);
      offset+=2;
      rawToByte[i]=(byte)(Integer.parseInt(chunk,16) & 0x000000FF);
    }
    return rawToByte;
  }
  return null;
}
  byte[] __target__(String hexText){
  String chunk=null;
  if (hexText != null && hexText.length() >= 0) {
    int numBytes=hexText.length() / 2;
    byte[] rawToByte=new byte[numBytes];
    int offset=0;
    for (int i=0; i < numBytes; i++) {
      chunk=hexText.substring(offset,offset + 2);
      offset+=2;
      rawToByte[i]=(byte)(Integer.parseInt(chunk,16) & 0x000000FF);
    }
    return rawToByte;
  }
  return null;
}

}