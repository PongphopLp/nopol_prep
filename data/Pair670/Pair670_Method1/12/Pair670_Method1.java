import java.util.*;

public class Target {

int compare(byte[] a1,int off1,int len1,byte[] a2,int off2,int len2){
  for (int i=0; i < len1 && i < len2; i++) {
    int d=(a1[off1 + i] & 0xFF) - (a2[off2 + i] & 0xFF);
    if (d != 0)     return d;
  }
  return len1 - len2;
}
  int __target__(byte[] a1,int off1,int len1,byte[] a2,int off2,int len2){
  for (int i=0; i < len1 && i < len2; i++) {
    int d=(a1[off1 + i] & 0xFF) - (a2[off2 + i] & 0xFF);
    if (d == 0)     return d;
  }
  return len1 - len2;
}

}