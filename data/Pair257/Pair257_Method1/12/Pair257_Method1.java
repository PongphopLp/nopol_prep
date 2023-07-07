import java.util.*;

public class Target {

boolean equals(double[] p_D0,double[] p_D1,double p_Epsilon){
  if (p_D0 == p_D1) {
    return true;
  }
  if (p_D0 == null || p_D1 == null || p_D0.length != p_D1.length) {
    return false;
  }
  if (p_Epsilon < 0)   p_Epsilon=-p_Epsilon;
  for (int i=0; i < p_D0.length; i++) {
    if (Math.abs(p_D0[i] - p_D1[i]) > p_Epsilon) {
      return false;
    }
  }
  return true;
}
  boolean __target__(double[] p_D0,double[] p_D1,double p_Epsilon){
  if (p_D0 == p_D1) {
    return true;
  }
  if (p_D0 == null || p_D1 == null || p_D0.length != p_D1.length) {
    return false;
  }
  if (p_Epsilon < 0)   p_Epsilon=-p_Epsilon;
  for (int i=0; i < p_D0.length; i++) {
    if (Math.abs(p_D0[i] - p_D1[i]) >= p_Epsilon) {
      return false;
    }
  }
  return true;
}

}