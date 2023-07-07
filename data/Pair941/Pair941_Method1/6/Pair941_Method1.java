import java.util.*;

public class Target {

int compareIgnoreCase(String s1,String s2){
  final int n1=s1.length(), n2=s2.length();
  final int lim=Math.min(n1,n2);
  for (int k=0; k < lim; k++) {
    char c1=s1.charAt(k);
    char c2=s2.charAt(k);
    if (c1 != c2) {
      c1=Character.toUpperCase(c1);
      c2=Character.toUpperCase(c2);
      if (c1 != c2) {
        c1=Character.toLowerCase(c1);
        c2=Character.toLowerCase(c2);
        if (c1 != c2) {
          return c1 - c2;
        }
      }
    }
  }
  return n1 - n2;
}
  int __target__(String s1,String s2){
  final int n1=s1.length(), n2=s2.length();
  final int lim=Math.min(n1,n2);
  for (int k=0; k < lim; k++) {
    char c1=s1.charAt(k);
    char c2=s2.charAt(k);
    if (c1 != c2) {
      c1=Character.toUpperCase(c1);
      c2=Character.toUpperCase(c2);
      if (c1 != c2) {
        c1=Character.toLowerCase(c1);
        c2=Character.toLowerCase(c2);
        if (c1 == c2) {
          return c1 - c2;
        }
      }
    }
  }
  return n1 - n2;
}

}