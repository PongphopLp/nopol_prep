import java.util.*;

public class Target {

long[] toLongs(byte[] b,int off,int len){
  final int clen=len >>> 3;
  final long[] c=new long[clen];
  for (int i=0, bi=off; i < clen; i++, bi+=8) {
    c[i]=(b[bi + 7] & 0xFFL) + ((b[bi + 6] & 0xFFL) << 8) + ((b[bi + 5] & 0xFFL) << 16)+ ((b[bi + 4] & 0xFFL) << 24)+ ((b[bi + 3] & 0xFFL) << 32)+ ((b[bi + 2] & 0xFFL) << 40)+ ((b[bi + 1] & 0xFFL) << 48)+ (((long)b[bi]) << 56);
  }
  return c;
}
  long[] __target__(byte[] b,int off,int len){
  final int clen=len << 3;
  final long[] c=new long[clen];
  for (int i=0, bi=off; i < clen; i++, bi+=8) {
    c[i]=(b[bi + 7] & 0xFFL) + ((b[bi + 6] & 0xFFL) << 8) + ((b[bi + 5] & 0xFFL) << 16)+ ((b[bi + 4] & 0xFFL) << 24)+ ((b[bi + 3] & 0xFFL) << 32)+ ((b[bi + 2] & 0xFFL) << 40)+ ((b[bi + 1] & 0xFFL) << 48)+ (((long)b[bi]) << 56);
  }
  return c;
}

}