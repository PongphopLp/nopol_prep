import java.util.*;

public class Target {

int indexOf(CharSequence s,char c,int fromIndex){
  for (int i=fromIndex; i < s.length(); i++) {
    if (s.charAt(i) == c)     return i;
  }
  return -1;
}
  int __target__(CharSequence s,char c,int fromIndex){
  for (int i=fromIndex; i < s.length(); i++) {
    if (s.charAt(i) != c)     return i;
  }
  return -1;
}

}