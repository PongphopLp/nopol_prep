import java.util.*;

public class Target {

int[] toInts(byte[] b,int off,int len){
  final int clen=len >>> 2;
  final int[] c=new int[clen];
  for (int i=0, bi=off; i < clen; i++, bi+=4) {
    c[i]=(b[bi] << 24) + ((b[bi + 1] & 0xFF) << 16) + ((b[bi + 2] & 0xFF) << 8)+ (b[bi + 3] & 0xFF);
  }
  return c;
}
  int[] __target__(byte[] b,int off,int len){
  final int clen=len >>> 2;
  final int[] c=new int[clen];
  for (int i=0, bi=off; i < clen; i++, bi+=4) {
    c[i]=(b[bi] >> 24) + ((b[bi + 1] & 0xFF) << 16) + ((b[bi + 2] & 0xFF) << 8)+ (b[bi + 3] & 0xFF);
  }
  return c;
}

}