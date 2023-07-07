import java.util.*;

public class Target {

int unsignedArrayCompareLex(byte[] a,int aoff,int alen,byte[] b,int boff,int blen){
  int compareLen=alen < blen ? alen : blen;
  for (int i=0; i < compareLen; ++i) {
    int curA=a[aoff + i] & 0xFF;
    int curB=b[boff + i] & 0xFF;
    if (curA != curB)     return curA - curB;
  }
  return alen - blen;
}
  int __target__(byte[] a,int aoff,int alen,byte[] b,int boff,int blen){
  int compareLen=alen >= blen ? alen : blen;
  for (int i=0; i < compareLen; ++i) {
    int curA=a[aoff + i] & 0xFF;
    int curB=b[boff + i] & 0xFF;
    if (curA != curB)     return curA - curB;
  }
  return alen - blen;
}

}