import java.util.*;

public class Target {

int byteArrayToInt(byte[] b){
  int value=0;
  for (int i=0; i < 4; i++) {
    int shift=(4 - 1 - i) * 8;
    value+=(b[i] & 0x000000FF) << shift;
  }
  return value;
}
  int __target__(byte[] b){
  int value=0;
  for (int i=0; i < 4; i++) {
    int shift=(4 - 1 - i) * 8;
    value+=(b[i] & 0x000000FF) >> shift;
  }
  return value;
}

}