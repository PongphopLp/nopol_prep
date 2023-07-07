import java.util.*;

public class Target {

byte[] getGarminByteArray(char[] buffer,int offset,int length){
  byte[] value=new byte[length];
  int index=length - 1;
  while (index >= 0) {
    value[index]=(byte)(buffer[offset + index] & 0xff);
    index--;
  }
  return (value);
}
  byte[] __target__(char[] buffer,int offset,int length){
  byte[] value=new byte[length];
  int index=length - 1;
  while (index >= 0) {
    value[index]=(byte)(buffer[offset + index] | 0xff);
    index--;
  }
  return (value);
}

}