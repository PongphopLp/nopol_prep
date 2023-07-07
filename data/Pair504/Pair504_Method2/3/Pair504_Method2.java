import java.util.*;

public class Target {

double getDoubleFromInt(byte[] ba,int off){
  double ret=0.0;
  for (int n=0; n < 4; n++) {
    ret+=(double)((0xff & ba[off + n]) << ((3 - n) * 8));
  }
  return ret;
}
  double __target__(byte[] ba,int off){
  double ret=0.0;
  for (int n=0; n < 4; n++) {
    ret+=(double)((0xff | ba[off + n]) << ((3 - n) * 8));
  }
  return ret;
}

}