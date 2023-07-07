import java.util.*;

public class Target {

int countTrailingSpaces(CharSequence s){
  int l=s.length();
  int n=0;
  while (n < l && s.charAt(l - n - 1) == ' ')   n++;
  return n == s.length() ? 0 : n;
}
  int __target__(CharSequence s){
  int l=s.length();
  int n=0;
  while (n <= l && s.charAt(l - n - 1) == ' ')   n++;
  return n == s.length() ? 0 : n;
}

}