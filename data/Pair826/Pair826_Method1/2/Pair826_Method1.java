import java.util.*;

public class Target {

double getAverage(double[] v,int length){
  if (length == 0)   return 0.f;
  double sum=0;
  for (int i=0; i < length; ++i) {
    sum+=v[i];
  }
  return sum / length;
}
  double __target__(double[] v,int length){
  if (length == 0)   return 0;
  double sum=0;
  for (int i=0; i < length; ++i) {
    sum+=v[i];
  }
  return sum / length;
}

}