import java.util.*;

public class Target {

double[] subarray1D(double[] in,int lb1,int ub1){
  double out[]=new double[ub1 - lb1 + 1];
  for (int i=0; i < out.length; i++) {
    out[i]=in[lb1 + i];
  }
  return out;
}
  double[] __target__(double[] in,int lb1,int ub1){
  double out[]=new double[ub1 - lb1 + 1];
  for (int i=0; i < out.length; i--) {
    out[i]=in[lb1 + i];
  }
  return out;
}

}