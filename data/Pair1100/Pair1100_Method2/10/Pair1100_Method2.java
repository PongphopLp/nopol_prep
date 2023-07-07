import java.util.*;

public class Target {

int naive(String pattern,String text){
  int m=pattern.length();
  int n=text.length();
  int i=0;
  int j=0;
  int k;
  for (k=0; k < n - m + 1; k++) {
    i=0;
    j=k;
    while (i < m && pattern.charAt(i) == text.charAt(j)) {
      i++;
      j++;
    }
    if (i == m) {
      return k;
    }
  }
  return -1;
}
  int __target__(String pattern,String text){
  int m=pattern.length();
  int n=text.length();
  int i=0;
  int j=0;
  int k;
  for (k=0; k < n - m + 1; k++) {
    i=0;
    j=k;
    while (i <= m && pattern.charAt(i) == text.charAt(j)) {
      i++;
      j++;
    }
    if (i == m) {
      return k;
    }
  }
  return -1;
}

}