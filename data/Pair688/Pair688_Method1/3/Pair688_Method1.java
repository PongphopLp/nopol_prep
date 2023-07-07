import java.util.*;

public class Target {

int decodeInt(byte[] bytes,int offset){
  int ret=0;
  for (int i=3; i >= 0; i--) {
    ret<<=8;
    ret|=bytes[offset + i] & 0xFF;
  }
  return ret;
}
  int __target__(byte[] bytes,int offset){
  int ret=0;
  for (int i=3; i >= 0; i++) {
    ret<<=8;
    ret|=bytes[offset + i] & 0xFF;
  }
  return ret;
}

}