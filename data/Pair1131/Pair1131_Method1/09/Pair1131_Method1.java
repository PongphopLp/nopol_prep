import java.util.*;

public class Target {

int byteArrayCompare(byte[] aa,byte[] ab,int len){
  for (int i=0; i < len; i++) {
    int a=aa[i] & 0xff;
    int b=ab[i] & 0xff;
    if (a < b) {
      return -1;
    }
    if (a > b) {
      return 1;
    }
  }
  return 0;
}
  int __target__(byte[] aa,byte[] ab,int len){
  for (int i=0; i < len; i++) {
    int a=aa[i] & 0xff;
    int b=ab[i] & 0xff;
    if (a >= b) {
      return -1;
    }
    if (a > b) {
      return 1;
    }
  }
  return 0;
}

}