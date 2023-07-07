import java.util.*;

public class Target {

int compareBytes(byte[] b1,byte[] b2){
  int max=Math.min(b1.length,b2.length);
  for (int i=0; i < max; i++) {
    int byte1=(b1[i] & 0xff);
    int byte2=(b2[i] & 0xff);
    int diff=byte1 - byte2;
    if (diff != 0)     return diff;
  }
  return b1.length - b2.length;
}
  int __target__(byte[] b1,byte[] b2){
  int max=Math.min(b1.length,b2.length);
  for (int i=0; i <= max; i++) {
    int byte1=(b1[i] & 0xff);
    int byte2=(b2[i] & 0xff);
    int diff=byte1 - byte2;
    if (diff != 0)     return diff;
  }
  return b1.length - b2.length;
}

}