import java.util.*;

public class Target {

double calcCV(double[] values){
  double avg, stdev;
  double sum=0;
  for (  double d : values) {
    sum+=d;
  }
  avg=sum / values.length;
  if (avg == 0)   return Double.NaN;
  sum=0;
  for (  double d : values) {
    sum+=(d - avg) * (d - avg);
  }
  stdev=(double)Math.sqrt((double)sum / (double)(values.length - 1));
  return stdev / avg;
}
  double __target__(double[] values){
  double avg, stdev;
  double sum=0;
  for (  double d : values) {
    sum+=d;
  }
  avg=sum / values.length;
  if (avg == 0)   return Double.NaN;
  sum=0;
  for (  double d : values) {
    sum+=(d - avg) / (d - avg);
  }
  stdev=(double)Math.sqrt((double)sum / (double)(values.length - 1));
  return stdev / avg;
}

}