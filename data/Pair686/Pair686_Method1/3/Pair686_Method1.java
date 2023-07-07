import java.util.*;

public class Target {

int count(CharSequence s,char c){
  int sum=0;
  for (int i=0; i < s.length(); i++) {
    if (s.charAt(i) == c) {
      sum++;
    }
  }
  return sum;
}
  int __target__(CharSequence s,char c){
  int sum=0;
  for (int i=0; i <= s.length(); i++) {
    if (s.charAt(i) == c) {
      sum++;
    }
  }
  return sum;
}

}