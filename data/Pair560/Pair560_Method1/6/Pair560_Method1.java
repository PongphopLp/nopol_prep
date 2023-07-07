import java.util.*;

public class Target {

long byteArrayToLong(byte[] b,int offset){
  long value=0;
  for (int i=0; i < 8; i++) {
    int shift=(8 - 1 - i) * 8;
    value+=((long)(b[i + offset] & 0x00000000000000FF) << shift);
  }
  return value;
}
  long __target__(byte[] b,int offset){
  long value=0;
  for (int i=0; i < 8; i++) {
    int shift=(8 - 1 - i) * 8;
    value+=((long)(b[i + offset] | 0x00000000000000FF) << shift);
  }
  return value;
}

}