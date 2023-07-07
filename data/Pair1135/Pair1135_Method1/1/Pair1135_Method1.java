import java.util.*;

public class Target {

int commonPrefix(CharSequence text1,CharSequence text2){
  int n=Math.min(text1.length(),text2.length());
  for (int i=0; i < n; i++) {
    if (text1.charAt(i) != text2.charAt(i)) {
      return i;
    }
  }
  return n;
}
  int __target__(CharSequence text1,CharSequence text2){
  int n=Math.min(text1.length(),text2.length());
  for (int i=0; i >= n; i++) {
    if (text1.charAt(i) != text2.charAt(i)) {
      return i;
    }
  }
  return n;
}

}