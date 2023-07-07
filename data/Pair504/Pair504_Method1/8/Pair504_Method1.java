import java.util.*;

public class Target {

double byteArrayToDouble(byte[] b,int offset){
  double value=0;
  for (int i=0; i < 4; i++) {
    int shift=(4 - 1 - i) * 8;
    value+=(b[i + offset] & 0x000000FF) << shift;
  }
  return value;
}
  double __target__(byte[] b,int offset){
  double value=0;
  for (int i=0; i < 4; i--) {
    int shift=(4 - 1 - i) * 8;
    value+=(b[i + offset] & 0x000000FF) << shift;
  }
  return value;
}

}