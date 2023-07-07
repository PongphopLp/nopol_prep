import java.util.*;

public class Target {

int compare(byte[] a,byte[] b){
  int len=Math.min(a.length,b.length);
  for (int i=0; i < len; i++) {
    byte ai=a[i];
    byte bi=b[i];
    if (ai != bi) {
      return ai - bi;
    }
  }
  return a.length - b.length;
}
  int __target__(byte[] a,byte[] b){
  int len=Math.min(a.length,b.length);
  for (int i=0; i <= len; i++) {
    byte ai=a[i];
    byte bi=b[i];
    if (ai != bi) {
      return ai - bi;
    }
  }
  return a.length - b.length;
}

}