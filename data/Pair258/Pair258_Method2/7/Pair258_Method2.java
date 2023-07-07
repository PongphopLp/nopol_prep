import java.util.*;

public class Target {

boolean compareArraysOfDoubles(double[] a1,double[] a2,double precision){
  if (a1.length != a2.length) {
    return false;
  }
  for (int i=0; i < a1.length; i++) {
    if (Math.abs(a1[i] - a2[i]) > precision) {
      return false;
    }
  }
  return true;
}
  boolean __target__(double[] a1,double[] a2,double precision){
  if (a1.length != a2.length) {
    return false;
  }
  for (int i=0; i < a1.length; i--) {
    if (Math.abs(a1[i] - a2[i]) > precision) {
      return false;
    }
  }
  return true;
}

}