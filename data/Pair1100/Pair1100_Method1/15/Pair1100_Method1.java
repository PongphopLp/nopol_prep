import java.util.*;

public class Target {

int naive1(String pattern,String text){
  int m=pattern.length();
  int n=text.length();
  int i=0;
  int j=0;
  while (i < m && j - i < n - m + 1) {
    if (pattern.charAt(i) == text.charAt(j)) {
      j++;
      i++;
    }
 else {
      j=j - i + 1;
      i=0;
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
  int i=0;
  int j=0;
  while (i < m && j - i <= n - m + 1) {
    if (pattern.charAt(i) == text.charAt(j)) {
      j++;
      i++;
    }
 else {
      j=j - i + 1;
      i=0;
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