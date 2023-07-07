import java.util.*;

public class Target {

long decodeLong(byte[] bytes,int offset){
  long ret=0;
  for (int i=7; i >= 0; i--) {
    ret<<=8;
    ret|=bytes[offset + i] & 0xFF;
  }
  return ret;
}
  long __target__(byte[] bytes,int offset){
  long ret=0;
  for (int i=7; i >= 0; i--) {
    ret<<=8;
    ret|=bytes[offset + i] | 0xFF;
  }
  return ret;
}

}