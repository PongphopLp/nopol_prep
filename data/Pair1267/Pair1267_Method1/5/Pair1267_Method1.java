import java.util.*;

public class Target {

int compare(double[] o1,double[] o2){
  int result;
  double val1;
  double val2;
  result=0;
  val1=o1[1];
  val2=o2[1];
  if (val1 < val2) {
    result=1;
  }
 else {
    if (val1 > val2) {
      result=-1;
    }
  }
  return result;
}
  int __target__(double[] o1,double[] o2){
  int result;
  double val1;
  double val2;
  result=0;
  val1=o1[1];
  val2=o2[1];
  if (val1 < val2) {
    result=1;
  }
 else {
    if (val1 >= val2) {
      result=-1;
    }
  }
  return result;
}

}