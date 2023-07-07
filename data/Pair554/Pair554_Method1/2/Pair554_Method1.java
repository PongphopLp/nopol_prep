import java.util.*;

public class Target {

long longFrom(byte[] data,int offset){
  long x=0;
  for (int i=7; i >= 0; i--) {
    long y=data[offset + i] & 0xFF;
    x=(x << 8) | y;
  }
  return x;
}
  long __target__(byte[] data,int offset){
  long x=0;
  for (int i=7; i >= 0; i--) {
    long y=data[offset - i] & 0xFF;
    x=(x << 8) | y;
  }
  return x;
}

}