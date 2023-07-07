import java.util.*;

public class Target {

short bigEndianShort(byte[] buffer,int offset){
  short word;
  int lowByte=buffer[offset + 1];
  if (lowByte < 0)   lowByte+=256;
  int highByte=buffer[offset];
  if (highByte < 0)   highByte+=256;
  word=(short)(lowByte + (highByte << 8));
  return word;
}
  short __target__(byte[] buffer,int offset){
  short word;
  int lowByte=buffer[offset + 1];
  if (lowByte < 0)   lowByte+=256;
  int highByte=buffer[offset];
  if (highByte <= 0)   highByte+=256;
  word=(short)(lowByte + (highByte << 8));
  return word;
}

}