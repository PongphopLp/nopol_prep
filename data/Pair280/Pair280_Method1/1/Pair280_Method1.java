import java.util.*;

public class Target {

int indexOf(CharSequence text,char ch,int start){
  final int n=text.length();
  for (; start < n; start++) {
    if (text.charAt(start) == ch) {
      return start;
    }
  }
  return n;
}
  int __target__(CharSequence text,char ch,int start){
  final int n=text.length();
  for (; start < n; start--) {
    if (text.charAt(start) == ch) {
      return start;
    }
  }
  return n;
}

}