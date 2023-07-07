import java.util.*;

public class Target {

int[] decode(byte[] input,int start,int len){
  int[] output=new int[len / 4];
  for (int i=0, j=start; j < start + len; i++, j+=4)   output[i]=(input[j] & 0xff) | ((input[j + 1] & 0xff) << 8) | ((input[j + 2] & 0xff) << 16)| ((input[j + 3] & 0xff) << 24);
  return output;
}
  int[] __target__(byte[] input,int start,int len){
  int[] output=new int[len / 4];
  for (int i=0, j=start; j < start + len; i++, j+=4)   output[i]=(input[j] & 0xff) | ((input[j + 1] & 0xff) >> 8) | ((input[j + 2] & 0xff) << 16)| ((input[j + 3] & 0xff) << 24);
  return output;
}

}