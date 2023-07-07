import java.util.*;

public class Target {

boolean byteMatch(byte[] a,int aOff,byte[] b,int bOff,int len){
  if ((a.length < aOff + len) || (b.length < bOff + len))   return false;
  for (int i=0; i < len; i++) {
    if (a[i + aOff] != b[i + bOff])     return false;
  }
  return true;
}
  boolean __target__(byte[] a,int aOff,byte[] b,int bOff,int len){
  if ((a.length < aOff + len) || (b.length < bOff - len))   return false;
  for (int i=0; i < len; i++) {
    if (a[i + aOff] != b[i + bOff])     return false;
  }
  return true;
}

}