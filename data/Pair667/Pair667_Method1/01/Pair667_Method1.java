import java.util.*;

public class Target {

int parseInt(byte[] b,int start){
  if (b == null || b.length < start + (Integer.SIZE / Byte.SIZE))   return 0;
 else {
    int result=0;
    int size=Integer.SIZE / Byte.SIZE;
    for (int i=0; i < size; i++) {
      result+=(0xff << ((size - i - 1) * Byte.SIZE)) & (b[i + start] << ((size - i - 1) * Byte.SIZE));
    }
    return result;
  }
}
  int __target__(byte[] b,int start){
  if (b == null || b.length <= start + (Integer.SIZE / Byte.SIZE))   return 0;
 else {
    int result=0;
    int size=Integer.SIZE / Byte.SIZE;
    for (int i=0; i < size; i++) {
      result+=(0xff << ((size - i - 1) * Byte.SIZE)) & (b[i + start] << ((size - i - 1) * Byte.SIZE));
    }
    return result;
  }
}

}