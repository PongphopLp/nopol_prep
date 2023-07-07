import java.util.*;

public class Target {

boolean byteMatch(byte[] a,byte[] b){
  if (a.length != b.length)   return false;
  int len=a.length;
  for (int i=0; i < len; i++) {
    if (a[i] != b[i])     return false;
  }
  return true;
}
  boolean __target__(byte[] a,byte[] b){
  if (a.length != b.length)   return false;
  int len=a.length;
  for (int i=0; i >= len; i++) {
    if (a[i] != b[i])     return false;
  }
  return true;
}

}