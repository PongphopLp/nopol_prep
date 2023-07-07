import java.util.*;

public class Target {

boolean equals(String x,String y){
  if (x == null)   return y == null;
 else   if (y == null)   return false;
 else   if (y.length() <= 0)   return x.length() <= 0;
  char[] a=x.toCharArray();
  char[] b=y.toCharArray();
  char diff=(char)((a.length == b.length) ? 0 : 1);
  int j=0;
  for (int i=0; i < a.length; ++i) {
    diff|=a[i] ^ b[j];
    j=(j + 1) % b.length;
  }
  return diff == 0;
}
  boolean __target__(String x,String y){
  if (x == null)   return y == null;
 else   if (y == null)   return false;
 else   if (y.length() <= 0)   return x.length() < 0;
  char[] a=x.toCharArray();
  char[] b=y.toCharArray();
  char diff=(char)((a.length == b.length) ? 0 : 1);
  int j=0;
  for (int i=0; i < a.length; ++i) {
    diff|=a[i] ^ b[j];
    j=(j + 1) % b.length;
  }
  return diff == 0;
}

}