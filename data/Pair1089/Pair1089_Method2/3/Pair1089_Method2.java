import java.util.*;

public class Target {

int bigEndianToUnsignedInt(byte[] b,int offset,int length){
  int v=0;
  while (length-- > 0)   v=(v << 8) | (b[offset++] & 0xff);
  return v;
}
  int __target__(byte[] b,int offset,int length){
  int v=0;
  while (length-- > 0)   v=(v << 8) & (b[offset++] & 0xff);
  return v;
}

}