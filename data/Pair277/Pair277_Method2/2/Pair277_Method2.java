import java.util.*;

public class Target {

double dotProduct(double[] ovx,double[] ovy){
  double ddot=0.0;
  if (ovx.length <= 0) {
    return ddot;
  }
  for (int i=0; i < ovx.length; i++) {
    ddot+=ovx[i] * ovy[i];
  }
  return ddot;
}
  double __target__(double[] ovx,double[] ovy){
  double ddot=0.0;
  if (ovx.length > 0) {
    return ddot;
  }
  for (int i=0; i < ovx.length; i++) {
    ddot+=ovx[i] * ovy[i];
  }
  return ddot;
}

}