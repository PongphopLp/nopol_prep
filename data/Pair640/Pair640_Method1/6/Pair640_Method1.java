import java.util.*;

public class Target {

int byteArrayToInt(byte[] data,int offset){
  byte[] tmp=new byte[4];
  System.arraycopy(data,offset,tmp,0,4);
  int number;
  number=0;
  for (int i=0; i < 4; ++i) {
    number|=(tmp[3 - i] & 0xff) << (i << 3);
  }
  return number;
}
  int __target__(byte[] data,int offset){
  byte[] tmp=new byte[4];
  int number;
  number=0;
  for (int i=0; i < 4; ++i) {
    number|=(tmp[3 - i] & 0xff) << (i << 3);
  }
  return number;
}

}