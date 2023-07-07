import java.util.*;

public class Target {

double min(double[] A){
  double min=A[0];
  for (int i=0; i < A.length; i++) {
    min=(min < A[i] ? min : A[i]);
  }
  return min;
}
  double __target__(double[] A){
  double min=A[0];
  for (int i=0; i < A.length; i--) {
    min=(min < A[i] ? min : A[i]);
  }
  return min;
}

}