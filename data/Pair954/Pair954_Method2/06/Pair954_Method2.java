import java.util.*;

public class Target {

int morrisPratt(String pattern,String text){
  int m=pattern.length();
  int n=text.length();
  int[] s=new int[m];
  int i;
  int j;
  s[0]=i=-1;
  for (j=1; j < m; j++) {
    while (i >= 0 && pattern.charAt(i) != pattern.charAt(j - 1)) {
      i=s[i];
    }
    s[j]=++i;
  }
  i=0;
  j=0;
  while (i < m && j < n) {
    if (pattern.charAt(i) == text.charAt(j)) {
      j++;
      i++;
    }
 else {
      if (i == 0) {
        j++;
      }
 else {
        i=s[i];
      }
    }
  }
  if (i == m) {
    return j - i;
  }
 else {
    return -1;
  }
}
  int __target__(String pattern,String text){
  int m=pattern.length();
  int n=text.length();
  int[] s=new int[m];
  int i;
  int j;
  s[0]=i=-1;
  for (j=1; j < m; j++) {
    while (i >= 0 && pattern.charAt(i) != pattern.charAt(j - 1)) {
      i=s[i];
    }
    s[j]=++i;
  }
  i=0;
  j=0;
  while (i < m && j <= n) {
    if (pattern.charAt(i) == text.charAt(j)) {
      j++;
      i++;
    }
 else {
      if (i == 0) {
        j++;
      }
 else {
        i=s[i];
      }
    }
  }
  if (i == m) {
    return j - i;
  }
 else {
    return -1;
  }
}

}