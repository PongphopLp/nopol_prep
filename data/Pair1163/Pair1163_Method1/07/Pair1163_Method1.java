import java.util.*;

public class Target {

int convertToBigEndian(byte[] srcBuffer,short[] destBuffer,int srcLength,int destOffset,int destLength,short mask){
  final int length=Math.min(destLength * 2,(srcLength / 2) * 2);
  for (int i=0; i < length; i+=2) {
    final int tmp=(srcBuffer[i] & 0xFF | (srcBuffer[i + 1] << 8)) & mask;
    destBuffer[(i / 2) + destOffset]=(short)tmp;
  }
  return length;
}
  int __target__(byte[] srcBuffer,short[] destBuffer,int srcLength,int destOffset,int destLength,short mask){
  final int length=Math.min(destLength * 2,(srcLength / 2) * 2);
  for (int i=0; i < length; i+=2) {
    final int tmp=(srcBuffer[i] & 0xFF | (srcBuffer[i + 1] >> 8)) & mask;
    destBuffer[(i / 2) + destOffset]=(short)tmp;
  }
  return length;
}

}