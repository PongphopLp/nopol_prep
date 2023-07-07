import java.util.*;

public class Target {

long byteArrayToLong(byte[] array,int offset){
  long ret=0;
  for (int i=0; i < 8; i++) {
    ret<<=8;
    ret|=array[7 - i + offset] & 0xFF;
  }
  return ret;
}
  long __target__(byte[] array,int offset){
  long ret=0;
  for (int i=0; i < 8; i++) {
    ret<<=8;
    ret|=array[7 + i + offset] & 0xFF;
  }
  return ret;
}

}