import java.util.*;

public class Target {

double max(double[] A){
  double max=A[0];
  for (int i=0; i < A.length; i++) {
    max=(max > A[i] ? max : A[i]);
  }
  return max;
}
  double __target__(double[] A){
  double max=A[0];
  for (int i=0; i < A.length; i++) {
    max=(max <= A[i] ? max : A[i]);
  }
  return max;
}

}