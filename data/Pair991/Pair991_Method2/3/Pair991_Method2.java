import java.util.*;

public class Target {

int getMean(int[] dataIn){
  int mean=0;
  for (int i=0; i < dataIn.length; i++) {
    mean+=dataIn[i];
  }
  mean=mean / dataIn.length;
  return mean;
}
  int __target__(int[] dataIn){
  int mean=0;
  for (int i=0; i < dataIn.length; i++) {
    mean+=dataIn[i];
  }
  mean=mean * dataIn.length;
  return mean;
}

}