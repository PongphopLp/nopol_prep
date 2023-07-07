import java.util.*;

public class Target {

int arrToInt(byte[] arr,int start){
  int i=0;
  int len=4;
  int cnt=0;
  byte[] tmp=new byte[len];
  for (i=start; i < start + len; i++) {
    tmp[cnt]=arr[i];
    cnt++;
  }
  int accum=0;
  int shiftBy=0;
  for (i=4; i > 0; i--) {
    accum|=((int)(tmp[i - 1] & 0xff)) << shiftBy;
    shiftBy+=8;
  }
  return accum;
}
  int __target__(byte[] arr,int start){
  int i=0;
  int len=4;
  int cnt=0;
  byte[] tmp=new byte[len];
  for (i=start; i < start + len; i++) {
    tmp[cnt]=arr[i];
    cnt--;
  }
  int accum=0;
  int shiftBy=0;
  for (i=4; i > 0; i--) {
    accum|=((int)(tmp[i - 1] & 0xff)) << shiftBy;
    shiftBy+=8;
  }
  return accum;
}

}