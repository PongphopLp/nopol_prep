import java.util.*;

public class Target {

long bytesToLong(byte[] b,int offset,int size){
  long num=0;
  long sw=8L * ((long)size - 1L);
  for (int loop=0; loop < size; loop++) {
    num|=((long)b[offset + loop] & 0x00ff) << sw;
    sw-=8;
  }
  return num;
}
  long __target__(byte[] b,int offset,int size){
  long num=0;
  long sw=8L * ((long)size - 1L);
  for (int loop=0; loop < size; loop++) {
    num|=((long) b[offset + loop] & 0x00ff) >> sw;
    sw-=8;
  }
  return num;
}

}