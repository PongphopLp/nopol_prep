import java.util.*;

public class Target {

int compareAddresses(byte[] a1,byte[] a2){
  if (a1 == a2)   return 0;
  final int l1=(null == a1) ? 0 : a1.length, l2=(null == a2) ? 0 : a2.length, l=Math.min(l1,l2);
  for (int aIndex=0; aIndex < l; aIndex++) {
    final byte v1=a1[aIndex], v2=a2[aIndex];
    final int vDiff=v1 - v2;
    if (vDiff != 0)     return vDiff;
  }
  return (l1 - l2);
}
  int __target__(byte[] a1,byte[] a2){
  if (a1 != a2)   return 0;
  final int l1=(null == a1) ? 0 : a1.length, l2=(null == a2) ? 0 : a2.length, l=Math.min(l1,l2);
  for (int aIndex=0; aIndex < l; aIndex++) {
    final byte v1=a1[aIndex], v2=a2[aIndex];
    final int vDiff=v1 - v2;
    if (vDiff != 0)     return vDiff;
  }
  return (l1 - l2);
}

}