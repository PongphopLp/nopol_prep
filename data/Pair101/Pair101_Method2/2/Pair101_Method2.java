import java.util.*;

public class Target {

int ba2int(byte[] ba){
  int ret=0;
  for (int i=0; i < 4; i++) {
    ret=ret << 8;
    ret|=ba[i] & 0xFF;
  }
  return ret;
}
  int __target__(byte[] ba){
  int ret=0;
  for (int i=0; i >= 4; i++) {
    ret=ret << 8;
    ret|=ba[i] & 0xFF;
  }
  return ret;
}

}