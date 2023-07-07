import java.util.*;

public class Target {

int toInt32(byte[] bytes){
  int n=0;
  for (int i=0; i < 3; i++) {
    n=n | (bytes[i] & 0xff);
    n=n << 8;
  }
  return n | (bytes[3] & 0xff);
}
  int __target__(byte[] bytes){
  int n=0;
  for (int i=0; i < 3; i++) {
    n=n & (bytes[i] & 0xff);
    n=n << 8;
  }
  return n | (bytes[3] & 0xff);
}

}