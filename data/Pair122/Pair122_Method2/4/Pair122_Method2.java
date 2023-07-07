import java.util.*;

public class Target {

int unsignedByteArrayToInt(byte[] b){
  int a=0;
  for (int i=3; i >= 0; i--) {
    a+=(b[3 - i] & 0xFF) << (i * 8);
  }
  return a;
}
  int __target__(byte[] b){
  int a=0;
  for (int i=3; i >= 0; i--) {
    a+=(b[3 - i] & 0xFF) << (i / 8);
  }
  return a;
}

}