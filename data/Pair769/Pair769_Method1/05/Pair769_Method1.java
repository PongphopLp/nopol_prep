import java.util.*;

public class Target {

int[] byteArrayToIntArray(byte[] source){
  int[] output=new int[source.length >> 2];
  for (int i=0, j=0; i < source.length; i+=4, ++j) {
    output[j]=((source[i] & 0xff) << 24) | ((source[i + 1] & 0xff) << 16) | ((source[i + 2] & 0xff) << 8)| source[i + 3] & 0xff;
  }
  return output;
}
  int[] __target__(byte[] source){
  int[] output=new int[source.length >> 2];
  for (int i=0, j=0; i < source.length; i+=4, ++j) {
    output[j]=((source[i] & 0xff) << 24) & ((source[i + 1] & 0xff) << 16) & ((source[i + 2] & 0xff) << 8) & source[i + 3] & 0xff;
  }
  return output;
}

}