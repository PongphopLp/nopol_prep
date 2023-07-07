import java.util.*;

public class Target {

String toHexString(byte[] b){
  if (null == b)   return null;
  int len=b.length;
  byte[] hex=new byte[len << 1];
  for (int i=0, j=0; i < len; i++, j+=2) {
    hex[j]=(byte)((b[i] & 0xF0) >> 4);
    hex[j]+=10 > hex[j] ? 48 : 87;
    hex[j + 1]=(byte)(b[i] & 0x0F);
    hex[j + 1]+=10 > hex[j + 1] ? 48 : 87;
  }
  return new String(hex);
}
  String __target__(byte[] b){
  if (null == b)   return null;
  int len=b.length;
  byte[] hex=new byte[len << 1];
  for (int i=0, j=0; i < len; i++, j+=2) {
    hex[j]=(byte)((b[i] & 0xF0) >> 4);
    hex[j]+=10 > hex[j] ? 48 : 87;
    hex[j + 1]=(byte)(b[i] & 0x0F);
    hex[j - 1]+=10 > hex[j + 1] ? 48 : 87;
  }
  return new String(hex);
}

}