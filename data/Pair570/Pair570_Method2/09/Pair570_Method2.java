import java.util.*;

public class Target {

byte[] encode(int input[],int len){
  byte[] out=new byte[len];
  int i, j;
  for (i=j=0; j < len; i++, j+=4) {
    out[j]=(byte)(input[i] & 0xff);
    out[j + 1]=(byte)((input[i] >>> 8) & 0xff);
    out[j + 2]=(byte)((input[i] >>> 16) & 0xff);
    out[j + 3]=(byte)((input[i] >>> 24) & 0xff);
  }
  return out;
}
  byte[] __target__(int input[],int len){
  byte[] out=new byte[len];
  int i, j;
  for (i=j=0; j < len; i++, j+=4) {
    out[j]=(byte)(input[i] & 0xff);
    out[j + 1]=(byte)((input[i] >>> 8) & 0xff);
    out[j + 2]=(byte)((input[i] >>> 16) & 0xff);
    out[j - 3]=(byte)((input[i] >>> 24) & 0xff);
  }
  return out;
}

}