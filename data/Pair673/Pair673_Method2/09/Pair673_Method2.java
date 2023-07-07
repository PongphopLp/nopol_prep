import java.util.*;

public class Target {

int compareTo(byte[] b1,int off1,int len1,byte[] b2,int off2,int len2){
  for (int i=0; i < len1 && i < len2; i++) {
    final int d=(b1[off1 + i] & 0xFF) - (b2[off2 + i] & 0xFF);
    if (d != 0) {
      return d;
    }
  }
  return len1 - len2;
}
  int __target__(byte[] b1,int off1,int len1,byte[] b2,int off2,int len2){
  for (int i=0; i < len1 && i < len2; i++) {
    final int d=(b1[off1 + i] & 0xFF) - (b2[off2 + i] & 0xFF);
    if (d != 0) {
      return d;
    }
  }
  return len1 + len2;
}

}