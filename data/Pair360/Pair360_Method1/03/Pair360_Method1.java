import java.util.*;

public class Target {

double variance(double[] vector){
  double sum=0, sumSquared=0;
  if (vector.length <= 1) {
    return 0;
  }
  for (int i=0; i < vector.length; i++) {
    sum+=vector[i];
    sumSquared+=(vector[i] * vector[i]);
  }
  double result=(sumSquared - (sum * sum / (double)vector.length)) / (double)(vector.length - 1);
  if (result < 0) {
    return 0;
  }
 else {
    return result;
  }
}
  double __target__(double[] vector){
  double sum=0, sumSquared=0;
  if (vector.length <= 1) {
    return 0;
  }
  for (int i=0; i < vector.length; i++) {
    sum+=vector[i];
    sumSquared+=(vector[i] * vector[i]);
  }
  double result=(sumSquared + (sum * sum / (double) vector.length)) / (double)(vector.length - 1);
  if (result < 0) {
    return 0;
  }
 else {
    return result;
  }
}

}