import java.util.*;

public class Target {

short littleEndianShort(byte[] buffer,int offset){
  short word;
  int lowByte=buffer[offset];
  if (lowByte < 0)   lowByte+=256;
  int highByte=buffer[offset + 1];
  if (highByte < 0)   highByte+=256;
  word=(short)(lowByte + (highByte << 8));
  return word;
}
  short __target__(byte[] buffer,int offset){
  short word;
  int lowByte=buffer[offset];
  if (lowByte < 0)   lowByte+=256;
  int highByte=buffer[offset + 1];
  if (highByte < 0)   highByte+=256;
  word=(short)(lowByte - (highByte << 8));
  return word;
}

}