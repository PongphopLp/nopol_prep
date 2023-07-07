import java.util.*;

public class Target {

int compareBytes(byte[] a1,byte[] a2){
  if (a1 == a2)   return 0;
  int len1=(a1 == null ? 0 : a1.length);
  int len2=(a2 == null ? 0 : a2.length);
  int n=Math.min(len1,len2);
  byte b1, b2;
  for (int i=0; i < n; i++) {
    b1=a1[i];
    b2=a2[i];
    if (b1 != b2)     return b1 - b2;
  }
  return len1 - len2;
}
  int __target__(byte[] a1,byte[] a2){
  if (a1 == a2)   return 0;
  int len1=(a1 == null ? 0 : a1.length);
  int len2=(a2 == null ? 0 : a2.length);
  int n=Math.min(len1,len2);
  byte b1, b2;
  for (int i=0; i < n; i++) {
    b1=a1[i];
    b2=a2[i];
    if (b1 != b2)     return b1 - b2;
  }
  return len1 + len2;
}

}