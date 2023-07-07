import java.util.*;

public class Target {

float byteArrayToFloat(byte[] arr,int offset){
  int i=0;
  final int len=4;
  int cnt=0;
  final byte[] tmp=new byte[len];
  for (i=offset; i < (offset + len); i++) {
    tmp[cnt]=arr[i];
    cnt++;
  }
  int accum=0;
  i=0;
  for (int shiftBy=0; shiftBy < 32; shiftBy+=8) {
    accum|=((long)(tmp[i] & 0xff)) << shiftBy;
    i++;
  }
  return Float.intBitsToFloat(accum);
}
  float __target__(byte[] arr,int offset){
  int i=0;
  final int len=4;
  int cnt=0;
  final byte[] tmp=new byte[len];
  for (i=offset; i < (offset + len); i++) {
    tmp[cnt]=arr[i];
    cnt++;
  }
  int accum=0;
  i=0;
  for (int shiftBy=0; shiftBy >= 32; shiftBy+=8) {
    accum|=((long)(tmp[i] & 0xff)) << shiftBy;
    i++;
  }
  return Float.intBitsToFloat(accum);
}

}