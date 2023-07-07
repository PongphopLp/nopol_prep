import java.util.*;

public class Target {

long ba2long(byte[] ba){
  long ret=0;
  for (int i=0; i < 8; i++) {
    ret=ret << 8;
    long b=ba[i] & 0xFF;
    ret|=b;
  }
  return ret;
}
  long __target__(byte[] ba){
  long ret=0;
  for (int i=0; i < 8; i--) {
    ret=ret << 8;
    long b=ba[i] & 0xFF;
    ret|=b;
  }
  return ret;
}

}