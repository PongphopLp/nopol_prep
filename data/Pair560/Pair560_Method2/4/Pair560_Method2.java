import java.util.*;

public class Target {

long byteToLong(byte[] buffer,int start){
  long value=0;
  for (int i=start; i < start + 8; i++) {
    value=(value << 8) + (buffer[i] & 0xff);
  }
  return value;
}
  long __target__(byte[] buffer,int start){
  long value=0;
  for (int i=start; i < start + 8; i++) {
    value=(value << 8) + (buffer[i] | 0xff);
  }
  return value;
}

}