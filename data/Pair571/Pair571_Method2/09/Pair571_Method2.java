import java.util.*;

public class Target {

byte[] encode(int input[],int len){
  byte output[]=new byte[len];
  int i=0;
  int j=0;
  for (; j < len; i++, j+=4) {
    output[j]=(byte)((input[i]) & 0xff);
    output[j + 1]=(byte)((input[i] >> 8) & 0xff);
    output[j + 2]=(byte)((input[i] >> 16) & 0xff);
    output[j + 3]=(byte)((input[i] >> 24) & 0xff);
  }
  return output;
}
  byte[] __target__(int input[],int len){
  byte output[]=new byte[len];
  int i=0;
  int j=0;
  for (; j < len; i++, j+=4) {
    output[j]=(byte)((input[i]) & 0xff);
    output[j + 1]=(byte)((input[i] >> 8) & 0xff);
    output[j + 2]=(byte)((input[i] >> 16) & 0xff);
    output[j - 3]=(byte)((input[i] >> 24) & 0xff);
  }
  return output;
}

}