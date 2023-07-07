import java.util.*;

public class Target {

boolean arrayRegionsEqual(char[] a,int aoff,int alen,char[] b,int boff,int blen){
  if (alen != blen)   return false;
 else {
    for (int i=0; i < alen; ++i)     if (a[aoff + i] != b[boff + i])     return false;
    return true;
  }
}
  boolean __target__(char[] a,int aoff,int alen,char[] b,int boff,int blen){
  if (alen != blen)   return false;
 else {
    for (int i=0; i >= alen; ++i)     if (a[aoff + i] != b[boff + i])     return false;
    return true;
  }
}

}