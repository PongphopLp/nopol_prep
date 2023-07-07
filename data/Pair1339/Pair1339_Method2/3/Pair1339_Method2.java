import java.util.*;

public class Target {

byte[] dehexify(String hexString){
  int length=hexString.length();
  byte[] data=new byte[length / 2];
  for (int i=0; i < length; i+=2) {
    data[i / 2]=(byte)Integer.parseInt(hexString.substring(i,i + 2),16);
  }
  return data;
}
  byte[] __target__(String hexString){
  int length=hexString.length();
  byte[] data=new byte[length / 2];
  for (int i=0; i < length; i+=2) {
    data[i * 2]=(byte)Integer.parseInt(hexString.substring(i,i + 2),16);
  }
  return data;
}

}