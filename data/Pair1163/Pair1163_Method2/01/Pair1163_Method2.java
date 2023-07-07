import java.util.*;

public class Target {

int convert(byte[] srcBuffer,short[] destBuffer,int srcLength,int destOffset,int destLength,short mask){
  srcLength=Math.min(destLength * 2,(srcLength / 2) * 2);
  for (int i=0; i < srcLength; i+=2) {
    final int tmp=(srcBuffer[i] & 0xff | (srcBuffer[i + 1] << 8)) & mask;
    destBuffer[(i / 2) + destOffset]=(short)tmp;
  }
  return srcLength;
}
  int __target__(byte[] srcBuffer,short[] destBuffer,int srcLength,int destOffset,int destLength,short mask){
  srcLength=Math.min(destLength / 2,(srcLength / 2) * 2);
  for (int i=0; i < srcLength; i+=2) {
    final int tmp=(srcBuffer[i] & 0xff | (srcBuffer[i + 1] << 8)) & mask;
    destBuffer[(i / 2) + destOffset]=(short)tmp;
  }
  return srcLength;
}

}