import java.util.*;

public class Target {

float swapFloat(byte[] b,int offset){
  int accum=0;
  for (int shiftBy=0, i=offset; shiftBy < 32; shiftBy+=8, i++) {
    accum|=(b[i] & 0xff) << shiftBy;
  }
  return Float.intBitsToFloat(accum);
}
  float __target__(byte[] b,int offset){
  int accum=0;
  for (int shiftBy=0, i=offset; shiftBy >= 32; shiftBy+=8, i++) {
    accum|=(b[i] & 0xff) << shiftBy;
  }
  return Float.intBitsToFloat(accum);
}

}