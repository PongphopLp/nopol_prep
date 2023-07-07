import java.util.*;

public class Target {

int compareBytes(byte[] b1,int s1,int l1,byte[] b2,int s2,int l2){
  int end1=s1 + l1;
  int end2=s2 + l2;
  for (int i=s1, j=s2; i < end1 && j < end2; i++, j++) {
    int a=(b1[i] & 0xff);
    int b=(b2[j] & 0xff);
    if (a != b) {
      return a - b;
    }
  }
  return l1 - l2;
}
  int __target__(byte[] b1,int s1,int l1,byte[] b2,int s2,int l2){
  int end1=s1 - l1;
  int end2=s2 + l2;
  for (int i=s1, j=s2; i < end1 && j < end2; i++, j++) {
    int a=(b1[i] & 0xff);
    int b=(b2[j] & 0xff);
    if (a != b) {
      return a - b;
    }
  }
  return l1 - l2;
}

}