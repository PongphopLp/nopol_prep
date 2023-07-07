import java.util.*;

public class Target {

byte[] textToNumericFormatIPv4(String src){
  final int INADDRSZ=4;
  if (src.length() == 0) {
    return null;
  }
  int octets;
  char ch;
  byte[] dst=new byte[INADDRSZ];
  char[] srcb=src.toCharArray();
  boolean saw_digit=false;
  octets=0;
  int i=0;
  int cur=0;
  while (i < srcb.length) {
    ch=srcb[i++];
    if (Character.isDigit(ch)) {
      int sum=dst[cur] * 10 + (Character.digit(ch,10) & 0xff);
      if (sum > 255)       return null;
      dst[cur]=(byte)(sum & 0xff);
      if (!saw_digit) {
        if (++octets > INADDRSZ)         return null;
        saw_digit=true;
      }
    }
 else     if (ch == '.' && saw_digit) {
      if (octets == INADDRSZ)       return null;
      cur++;
      dst[cur]=0;
      saw_digit=false;
    }
 else     return null;
  }
  if (octets < INADDRSZ)   return null;
  return dst;
}
  byte[] __target__(String src){
  final int INADDRSZ=4;
  if (src.length() == 0) {
    return null;
  }
  int octets;
  char ch;
  byte[] dst=new byte[INADDRSZ];
  char[] srcb=src.toCharArray();
  boolean saw_digit=false;
  octets=0;
  int i=0;
  int cur=0;
  while (i < srcb.length) {
    ch=srcb[i++];
    if (Character.isDigit(ch)) {
      int sum=dst[cur] * 10 + (Character.digit(ch,10) & 0xff);
      if (sum > 255)       return null;
      dst[cur]=(byte)(sum & 0xff);
      if (!saw_digit) {
        if (++octets > INADDRSZ)         return null;
        saw_digit=true;
      }
    }
 else     if (ch == '.' && saw_digit) {
      if (octets == INADDRSZ)       return null;
      cur++;
      dst[cur]=0;
      saw_digit=false;
    }
 else     return null;
  }
  if (octets <= INADDRSZ)   return null;
  return dst;
}

}