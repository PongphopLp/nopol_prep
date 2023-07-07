import java.util.*;

public class Target {

double swapDouble(byte[] b,int offset){
  long accum=0;
  long shiftedval;
  for (int shiftBy=0, i=offset; shiftBy < 64; shiftBy+=8, i++) {
    shiftedval=((long)(b[i] & 0xff)) << shiftBy;
    accum|=shiftedval;
  }
  return Double.longBitsToDouble(accum);
}
  double __target__(byte[] b,int offset){
  long accum=0;
  long shiftedval;
  for (int shiftBy=0, i=offset; shiftBy < 64; shiftBy+=8, i--) {
    shiftedval=((long)(b[i] & 0xff)) << shiftBy;
    accum|=shiftedval;
  }
  return Double.longBitsToDouble(accum);
}

}