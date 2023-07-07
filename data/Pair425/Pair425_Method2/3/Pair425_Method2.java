import java.util.*;

public class Target {

boolean arraysAreEqual(double[] a1,double[] a2){
  boolean result=true;
  if (a1 == null || a2 == null || a1.length != a2.length) {
    result=false;
  }
 else {
    for (int i=0; i < a1.length; ++i) {
      if (Math.abs(a1[i] - a2[i]) > 0.000001) {
        result=false;
        break;
      }
    }
  }
  return result;
}
  boolean __target__(double[] a1,double[] a2){
  boolean result=true;
  if (a1 == null || a2 == null || a1.length != a2.length) {
    result=false;
  }
 else {
    for (int i=0; i < a1.length; ++i) {
      if (Math.abs(a1[i] - a2[i]) >= 0.000001) {
        result=false;
        break;
      }
    }
  }
  return result;
}

}