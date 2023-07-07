import java.util.*;

public class Target {

int count(CharSequence seq,char c){
  int count=0;
  for (int i=0, n=seq.length(); i < n; i++) {
    if (c == seq.charAt(i)) {
      count++;
    }
  }
  return count;
}
  int __target__(CharSequence seq,char c){
  int count=0;
  for (int i=0, n=seq.length(); i < n; i++) {
    if (c == seq.charAt(i)) {
      count--;
    }
  }
  return count;
}

}