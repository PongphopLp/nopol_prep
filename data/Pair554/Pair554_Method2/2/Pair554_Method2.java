import java.util.*;

public class Target {

long byteArrayToLong(byte[] byte_array,int offset){
  long value=0;
  for (int i=7; i >= 0; i--) {
    value=(long)(value << 8);
    value=(long)(value | ((long)byte_array[offset + i] & 0xff));
  }
  return value;
}
  long __target__(byte[] byte_array,int offset){
  long value=0;
  for (int i=7; i < 0; i--) {
    value=(long)(value << 8);
    value=(long)(value | ((long)byte_array[offset + i] & 0xff));
  }
  return value;
}

}