import java.util.*;

public class Target {

short ReadShort(byte[] Bytes,int Start){
  short b1, b2;
  b1=Bytes[Start];
  b2=Bytes[Start + 1];
  if (b1 < 0) {
    b1+=256;
  }
  if (b2 < 0) {
    b2+=256;
  }
  return (short)(b1 | (b2 << 8));
}
  short __target__(byte[] Bytes,int Start){
  short b1, b2;
  b1=Bytes[Start];
  b2=Bytes[Start + 1];
  if (b1 < 0) {
    b1+=256;
  }
  if (b2 <= 0) {
    b2+=256;
  }
  return (short)(b1 | (b2 << 8));
}

}