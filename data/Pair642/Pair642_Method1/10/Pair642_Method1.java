import java.util.*;

public class Target {

int getInt(byte[] buffer,int offset){
  int bitNo=0;
  int result=0;
  for (int byteNo=3; byteNo >= 0; byteNo--) {
    final byte octet=buffer[(offset + byteNo) % buffer.length];
    for (int j=0; j < 8; j++) {
      if ((octet & (1 << (bitNo % 8))) != 0) {
        result|=(1 << bitNo);
      }
      bitNo++;
    }
  }
  return result;
}
  int __target__(byte[] buffer,int offset){
  int bitNo=0;
  int result=0;
  for (int byteNo=3; byteNo > 0; byteNo--) {
    final byte octet=buffer[(offset + byteNo) % buffer.length];
    for (int j=0; j < 8; j++) {
      if ((octet & (1 << (bitNo % 8))) != 0) {
        result|=(1 << bitNo);
      }
      bitNo++;
    }
  }
  return result;
}

}