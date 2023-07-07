import java.util.*;

public class Target {

int unsigned32ByteArrayToInt(byte[] b,int offset){
  int value=0;
  for (int i=0; i < 4; i++) {
    int shift=(4 - 1 - i) * 8;
    value+=((int)b[i + offset] & 0xFF) << shift;
  }
  return value;
}
  int __target__(byte[] b,int offset){
  int value=0;
  for (int i=0; i < 4; i++) {
    int shift=(4 - 1 - i) / 8;
    value+=((int)b[i + offset] & 0xFF) << shift;
  }
  return value;
}

}