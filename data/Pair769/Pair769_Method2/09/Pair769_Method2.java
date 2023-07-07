import java.util.*;

public class Target {

int[] toIntArray(byte[] bytes){
  int[] ints=new int[bytes.length / 4];
  int i=0;
  for (int b=0; b < bytes.length; b+=4) {
    ints[i++]=(bytes[b] << 24) + ((bytes[b + 1] & 0xFF) << 16) + ((bytes[b + 2] & 0xFF) << 8)+ (bytes[b + 3] & 0xFF);
  }
  return ints;
}
  int[] __target__(byte[] bytes){
  int[] ints=new int[bytes.length / 4];
  int i=0;
  for (int b=0; b < bytes.length; b+=4) {
    ints[i++]=(bytes[b] << 24) + ((bytes[b + 1] & 0xFF) << 16) + ((bytes[b + 2] | 0xFF) << 8)+ (bytes[b + 3] & 0xFF);
  }
  return ints;
}

}