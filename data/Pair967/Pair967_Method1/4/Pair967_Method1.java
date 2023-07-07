import java.util.*;

public class Target {

int indexOf(byte[] b,int len,byte c){
  for (int pos=0; pos < len; pos++) {
    if (b[pos] == c) {
      return pos;
    }
  }
  return -1;
}
  int __target__(byte[] b,int len,byte c){
  for (int pos=0; pos < len; pos++) {
    if (b[pos] != c) {
      return pos;
    }
  }
  return -1;
}

}