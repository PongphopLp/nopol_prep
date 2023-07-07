import java.util.*;

public class Target {

long byteArrayToLong(byte[] b){
  long value=0;
  for (int i=0; i < 8; i++) {
    int shift=(7 - i) * 8;
    value+=(long)((long)(b[i] & 0x00000000000000FF) << shift);
  }
  return value;
}
  long __target__(byte[] b){
  long value=0;
  for (int i=0; i < 8; i++) {
    int shift=(7 - i) / 8;
    value+=(long)((long)(b[i] & 0x00000000000000FF) << shift);
  }
  return value;
}

}