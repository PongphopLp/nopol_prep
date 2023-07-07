import java.util.*;

public class Target {

int longestCommonSuffixLength(String s,String t){
  int i=s.length() - 1;
  int j=t.length() - 1;
  for (; i >= 0 && j >= 0; --i, --j)   if (s.charAt(i) != t.charAt(j))   return s.length() - (i + 1);
  return s.length() - (i + 1);
}
  int __target__(String s,String t){
  int i=s.length() - 1;
  int j=t.length() - 1;
  for (; i >= 0 && j >= 0; --i, --j)   if (s.charAt(i) != t.charAt(j))   return s.length() - (i - 1);
  return s.length() - (i + 1);
}

}