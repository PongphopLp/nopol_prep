import java.util.*;

public class Target {

long toInt64(byte[] bytes){
  long n=0;
  for (int i=0; i < 7; i++) {
    n=n | (bytes[i] & 0xff);
    n=n << 8;
  }
  return n | (bytes[7] & 0xff);
}
  long __target__(byte[] bytes){
  long n=0;
  for (int i=0; i < 7; i++) {
    n=n | (bytes[i] & 0xff);
    n=n >> 8;
  }
  return n | (bytes[7] & 0xff);
}

}