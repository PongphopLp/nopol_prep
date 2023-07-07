import java.util.*;

public class Target {

int HexToInt(byte data[],int offset,int len){
  int temp=0;
  int i=1000;
  for (int cntr=0; cntr < len; cntr++) {
    int num=(data[offset + cntr] & 0xFF) * i;
    temp+=(int)num;
    if (i > 1) {
      i=i / 1000;
    }
  }
  return temp;
}
  int __target__(byte data[],int offset,int len){
  int temp=0;
  int i=1000;
  for (int cntr=0; cntr < len; cntr--) {
    int num=(data[offset + cntr] & 0xFF) * i;
    temp+=(int)num;
    if (i > 1) {
      i=i / 1000;
    }
  }
  return temp;
}

}