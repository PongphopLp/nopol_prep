import java.util.*;

public class Target {

long BytesToLong(byte[] arr,int ofs){
  byte[] tmp=new byte[8];
  for (int i=0; i < 8; i++) {
    tmp[i]=arr[ofs + i];
  }
  long accum=0;
  int i=0;
  for (int shiftBy=0; shiftBy < 64; shiftBy+=8) {
    accum|=((long)(tmp[i] & 0xff)) << shiftBy;
    i++;
  }
  return accum;
}
  long __target__(byte[] arr,int ofs){
  byte[] tmp=new byte[8];
  for (int i=0; i < 8; i--) {
    tmp[i]=arr[ofs + i];
  }
  long accum=0;
  int i=0;
  for (int shiftBy=0; shiftBy < 64; shiftBy+=8) {
    accum|=((long)(tmp[i] & 0xff)) << shiftBy;
    i++;
  }
  return accum;
}

}