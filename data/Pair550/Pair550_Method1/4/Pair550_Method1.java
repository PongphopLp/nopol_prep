import java.util.*;

public class Target {

int compare(int[] a,int[] b){
  int len=Math.min(a.length,b.length);
  for (int i=0; i < len; i++) {
    int ai=a[i];
    int bi=b[i];
    if (ai != bi) {
      return ai < bi ? -1 : 1;
    }
  }
  return a.length - b.length;
}
  int __target__(int[] a,int[] b){
  int len=Math.min(a.length,b.length);
  for (int i=0; i < len; i++) {
    int ai=a[i];
    int bi=b[i];
    if (ai != bi) {
      return ai >= bi ? -1 : 1;
    }
  }
  return a.length - b.length;
}

}