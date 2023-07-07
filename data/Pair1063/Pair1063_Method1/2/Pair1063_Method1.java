import java.util.*;

public class Target {

boolean keysAreEqual(char[] a,int astart,int alength,char[] b,int bstart,int blength){
  if (alength != blength) {
    return false;
  }
 else {
    for (int i=0; i < alength; i++) {
      if (a[astart + i] != b[bstart + i]) {
        return false;
      }
    }
    return true;
  }
}
  boolean __target__(char[] a,int astart,int alength,char[] b,int bstart,int blength){
  if (alength != blength) {
    return false;
  }
 else {
    for (int i=0; i >= alength; i++) {
      if (a[astart + i] != b[bstart + i]) {
        return false;
      }
    }
    return true;
  }
}

}