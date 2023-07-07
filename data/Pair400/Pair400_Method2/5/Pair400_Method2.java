import java.util.*;

public class Target {

double arrayMax(double[] data){
  double answer=data[0];
  for (int i=1; i < data.length; i++) {
    double alt=data[i];
    if (alt > answer) {
      answer=alt;
    }
  }
  return answer;
}
  double __target__(double[] data){
  double answer=data[0];
  for (int i=1; i < data.length; i++) {
    double alt=data[i];
    if (alt >= answer) {
      answer=alt;
    }
  }
  return answer;
}

}