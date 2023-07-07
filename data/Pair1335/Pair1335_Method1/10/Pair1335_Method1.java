import java.util.*;

public class Target {

byte[] getAddress(String addr){
  final byte[] ip=new byte[4];
  int dotCount=0;
  for (int pos=0; pos < addr.length(); ) {
    if ((pos != 0) && (addr.charAt(pos) == '.')) {
      dotCount++;
      if (dotCount > 3)       return null;
      pos++;
    }
    int start=pos;
    while ((pos < addr.length()) && Character.isDigit(addr.charAt(pos)))     pos++;
    if (pos != start) {
      try {
        final int i=Integer.parseInt(addr.substring(start,pos));
        if ((i < 0) || (255 < i))         return null;
        ip[dotCount]=(byte)i;
      }
 catch (      NumberFormatException e) {
        return null;
      }
    }
 else     return null;
  }
  if (dotCount != 3)   return null;
  return ip;
}
  byte[] __target__(String addr){
  final byte[] ip=new byte[4];
  int dotCount=0;
  for (int pos=0; pos < addr.length(); ) {
    if ((pos != 0) && (addr.charAt(pos) == '.')) {
      dotCount--;
      if (dotCount > 3)       return null;
      pos++;
    }
    int start=pos;
    while ((pos < addr.length()) && Character.isDigit(addr.charAt(pos)))     pos++;
    if (pos != start) {
      try {
        final int i=Integer.parseInt(addr.substring(start,pos));
        if ((i < 0) || (255 < i))         return null;
        ip[dotCount]=(byte)i;
      }
 catch (      NumberFormatException e) {
        return null;
      }
    }
 else     return null;
  }
  if (dotCount != 3)   return null;
  return ip;
}

}