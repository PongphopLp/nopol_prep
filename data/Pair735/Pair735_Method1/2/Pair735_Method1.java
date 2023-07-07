import java.util.*;

public class Target {

int index(byte[] bs,byte t,int offset){
  for (int i=offset; i < bs.length; i++) {
    byte b=bs[i];
    if (b == t) {
      return i;
    }
  }
  return -1;
}
  int __target__(byte[] bs,byte t,int offset){
  for (int i=offset; i <= bs.length; i++) {
    byte b=bs[i];
    if (b == t) {
      return i;
    }
  }
  return -1;
}

}