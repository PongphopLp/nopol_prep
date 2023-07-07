import java.util.*;

public class Target {

byte[] hex2ByteArray(String no){
  byte[] number=new byte[no.length() / 2];
  int i;
  for (i=0; i < no.length(); i+=2) {
    int j=Integer.parseInt(no.substring(i,i + 2),16);
    number[i / 2]=(byte)(j & 0x000000ff);
  }
  return number;
}
  byte[] __target__(String no){
  byte[] number=new byte[no.length() / 2];
  int i;
  for (i=0; i <= no.length(); i+=2) {
    int j=Integer.parseInt(no.substring(i,i + 2),16);
    number[i / 2]=(byte)(j & 0x000000ff);
  }
  return number;
}

}