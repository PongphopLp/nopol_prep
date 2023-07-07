import java.util.*;

public class Target {

byte[] hexStringToByteArray(String device){
  int len=device.length() / 2;
  byte[] data=new byte[len];
  for (int i=len - 1; i >= 0; i--) {
    data[i]=(byte)Integer.parseInt(device.substring(i * 2,i * 2 + 2),16);
  }
  return data;
}
  byte[] __target__(String device){
  int len=device.length() / 2;
  byte[] data=new byte[len];
  for (int i=len - 1; i >= 0; i--) {
    data[i]=(byte)Integer.parseInt(device.substring(i / 2,i * 2 + 2),16);
  }
  return data;
}

}