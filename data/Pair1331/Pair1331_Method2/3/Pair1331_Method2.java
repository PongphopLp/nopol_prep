import java.util.*;

public class Target {

byte[] getByteArray(String hexString){
  byte[] myByte=new byte[hexString.length() / 2];
  for (int x=0; x < hexString.length(); x+=2) {
    int intValue=Integer.parseInt(hexString.substring(x,x + 2),16);
    myByte[x / 2]=(byte)intValue;
  }
  return myByte;
}
  byte[] __target__(String hexString){
  byte[] myByte=new byte[hexString.length() / 2];
  for (int x=0; x < hexString.length(); x+=2) {
    int intValue=Integer.parseInt(hexString.substring(x,x - 2),16);
    myByte[x / 2]=(byte)intValue;
  }
  return myByte;
}

}