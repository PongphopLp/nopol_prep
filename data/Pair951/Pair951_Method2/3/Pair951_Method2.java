import java.util.*;

public class Target {

int commonPrefix(String s,String t){
  int i=0;
  final int MAX=(s.length() < t.length()) ? s.length() : t.length();
  if (s.isEmpty() || t.isEmpty())   return i;
  while (i < MAX) {
    if (s.charAt(i) != t.charAt(i))     break;
    i++;
  }
  return i;
}
  int __target__(String s,String t){
  int i=0;
  final int MAX=(s.length() < t.length()) ? s.length() : t.length();
  if (s.isEmpty() || t.isEmpty())   return i;
  while (i < MAX) {
    if (s.charAt(i) == t.charAt(i))     break;
    i++;
  }
  return i;
}

}