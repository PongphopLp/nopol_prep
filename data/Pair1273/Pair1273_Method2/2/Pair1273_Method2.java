import java.util.*;

public class Target {

short readShort(byte[] buffer,int offset){
  int b1=buffer[offset++];
  int b2=buffer[offset];
  if (b1 < 0) {
    b1+=256;
  }
  return (short)((b2 << 8) | b1);
}
  short __target__(byte[] buffer,int offset){
  int b1=buffer[offset++];
  int b2=buffer[offset];
  if (b1 < 0) {
    b1+=256;
  }
  return (short)((b2 >> 8) | b1);
}

}