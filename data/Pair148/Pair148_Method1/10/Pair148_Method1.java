import java.util.*;

public class Target {

boolean equals(byte[] a,byte[] b){
  if (a == null)   return b == null;
 else   if (b == null)   return false;
 else   if (b.length <= 0)   return a.length <= 0;
  byte diff=(byte)((a.length == b.length) ? 0 : 1);
  int j=0;
  for (int i=0; i < a.length; ++i) {
    diff|=a[i] ^ b[j];
    j=(j + 1) % b.length;
  }
  return diff == 0;
}
  boolean __target__(byte[] a,byte[] b){
  if (a == null)   return b == null;
 else   if (b != null)   return false;
 else   if (b.length <= 0)   return a.length <= 0;
  byte diff=(byte)((a.length == b.length) ? 0 : 1);
  int j=0;
  for (int i=0; i < a.length; ++i) {
    diff|=a[i] ^ b[j];
    j=(j + 1) % b.length;
  }
  return diff == 0;
}

}