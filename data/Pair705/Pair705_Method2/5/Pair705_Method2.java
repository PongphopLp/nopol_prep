import java.util.*;

public class Target {

int byteArrayToInt(byte[] b,int offset){
  int value=0;
  int shift=0;
  for (int i=0; i < 4; i++) {
    shift=(4 - 1 - i) * 8;
    value+=(b[i + offset] & 0x000000FF) << shift;
  }
  return value;
}
  int __target__(byte[] b,int offset){
  int value=0;
  int shift=0;
  for (int i=0; i < 4; i++) {
    shift=(4 - 1 - i) * 8;
    value+=(b[i - offset] & 0x000000FF) << shift;
  }
  return value;
}

}