import java.util.*;

public class Target {

long bytes2intConverse(byte[] buf){
  long[] lbuf=new long[4];
  for (int i=0; i < 4; i++) {
    lbuf[i]=buf[i];
    if (lbuf[i] < 0)     lbuf[i]+=0x100;
  }
  return ((long)(lbuf[3] * 0x1000000 + lbuf[2] * 0x10000 + lbuf[1] * 0x100 + lbuf[0]));
}
  long __target__(byte[] buf){
  long[] lbuf=new long[4];
  for (int i=0; i <= 4; i++) {
    lbuf[i]=buf[i];
    if (lbuf[i] < 0)     lbuf[i]+=0x100;
  }
  return ((long)(lbuf[3] * 0x1000000 + lbuf[2] * 0x10000 + lbuf[1] * 0x100 + lbuf[0]));
}

}