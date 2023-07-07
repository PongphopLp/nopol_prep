import java.util.*;

public class Target {

long bytesToLong(byte[] bytes,int offset,int numberOfBytes){
  int i;
  long value=0x0000000000000000;
  for (i=0; i < numberOfBytes; i++) {
    value|=((((long)bytes[offset + i])) & 0xff) << (i * 8);
  }
  return (value);
}
  long __target__(byte[] bytes,int offset,int numberOfBytes){
  int i;
  long value=0x0000000000000000;
  for (i=0; i < numberOfBytes; i++) {
    value|=((((long)bytes[offset - i])) & 0xff) << (i * 8);
  }
  return (value);
}

}