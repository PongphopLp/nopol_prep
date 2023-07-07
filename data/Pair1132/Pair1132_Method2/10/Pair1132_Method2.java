import java.util.*;

public class Target {

int decodePackBits(byte[] src,byte[] dest,int offsetDest){
  int destIndex=offsetDest;
  int srcIndex=0;
  while (srcIndex < src.length) {
    byte n=src[srcIndex];
    if (n >= 0) {
      System.arraycopy(src,++srcIndex,dest,destIndex,n + 1);
      srcIndex+=n + 1;
      destIndex+=n + 1;
    }
 else     if (n >= -127) {
      byte value=src[++srcIndex];
      for (int j=0; j < -n + 1; j++) {
        dest[destIndex++]=value;
      }
      srcIndex++;
    }
 else {
      srcIndex++;
    }
  }
  return destIndex - offsetDest;
}
  int __target__(byte[] src,byte[] dest,int offsetDest){
  int destIndex=offsetDest;
  int srcIndex=0;
  while (srcIndex < src.length) {
    byte n=src[srcIndex];
    if (n >= 0) {
      System.arraycopy(src,++srcIndex,dest,destIndex,n + 1);
      srcIndex+=n + 1;
      destIndex+=n + 1;
    }
 else     if (n >= -127) {
      byte value=src[++srcIndex];
      for (int j=0; j < -n + 1; j++) {
        dest[destIndex++]=value;
      }
      srcIndex++;
    }
 else {
      srcIndex--;
    }
  }
  return destIndex - offsetDest;
}

}