import java.util.*;

public class Target {

int getCommonPrefix(CharSequence s1,CharSequence s2){
  int i=0;
  while (s1.length() > i && s2.length() > i && s1.charAt(i) == s2.charAt(i)) {
    i++;
  }
  return i;
}
  int __target__(CharSequence s1,CharSequence s2){
  int i=0;
  while (s1.length() > i && s2.length() > i && s1.charAt(i) != s2.charAt(i)) {
    i++;
  }
  return i;
}

}