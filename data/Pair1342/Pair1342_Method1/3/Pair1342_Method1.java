import java.util.*;

public class Target {

int count(CharSequence s,char c){
  int count=0;
  for (int i=s.length(); --i >= 0; ) {
    if (s.charAt(i) == c)     count++;
  }
  return count;
}
  int __target__(CharSequence s,char c){
  int count=0;
  for (int i=s.length(); --i > 0; ) {
    if (s.charAt(i) == c)     count++;
  }
  return count;
}

}