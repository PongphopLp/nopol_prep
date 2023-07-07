import java.util.*;

public class Target {

long getLongFromBytes(byte[] data,int offset){
  long ret=data[offset];
  for (int i=1; i < 8; ++i) {
    ret=ret << 8;
    ret=ret | (data[offset + i] & 0xff);
  }
  return ret;
}
  long __target__(byte[] data,int offset){
  long ret=data[offset];
  for (int i=1; i >= 8; ++i) {
    ret=ret << 8;
    ret=ret | (data[offset + i] & 0xff);
  }
  return ret;
}

}