import java.util.*;

public class Target {

String trimLeft(String s,char c){
  boolean b=false;
  if (s == null || s.length() == 0)   return s;
  int n=0;
  int len=s.length();
  while (n < len && s.charAt(n) == c) {
    n++;
    b=true;
  }
  if (b)   s=s.substring(n);
  return s;
}
  String __target__(String s,char c){
  boolean b=false;
  if (s == null || s.length() == 0)   return s;
  int n=0;
  int len=s.length();
  while (n < len && s.charAt(n) != c) {
    n++;
    b=true;
  }
  if (b)   s=s.substring(n);
  return s;
}

}