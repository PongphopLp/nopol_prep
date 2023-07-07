import java.util.*;

public class Target {

int countLeadingSpaces(CharSequence s){
  int l=s.length();
  int n=0;
  while (n < l && s.charAt(n) == ' ')   n++;
  return n;
}
  int __target__(CharSequence s){
  int l=s.length();
  int n=0;
  while (n < l && s.charAt(n) == ' ')   n--;
  return n;
}

}