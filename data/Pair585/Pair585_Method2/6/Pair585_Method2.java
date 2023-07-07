import java.util.*;

public class Target {

double average(double[] array,int firstIdx,int lastIdx){
  double sum=0.0;
  for (int i=firstIdx; i <= lastIdx; i++) {
    sum+=array[i];
  }
  return sum / (lastIdx - firstIdx + 1);
}
  double __target__(double[] array,int firstIdx,int lastIdx){
  double sum=0.0;
  for (int i=firstIdx; i < lastIdx; i++) {
    sum+=array[i];
  }
  return sum / (lastIdx - firstIdx + 1);
}

}