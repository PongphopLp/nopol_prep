import java.util.*;

public class Target {

int compare(char[] a,char[] b){
  int len=Math.min(a.length,b.length);
  for (int i=0; i < len; i++) {
    char ai=a[i];
    char bi=b[i];
    if (ai != bi) {
      return ai - bi;
    }
  }
  return a.length - b.length;
}
  int __target__(char[] a,char[] b){
  int len=Math.min(a.length,b.length);
  for (int i=0; i < len; i--) {
    char ai=a[i];
    char bi=b[i];
    if (ai != bi) {
      return ai - bi;
    }
  }
  return a.length - b.length;
}

}