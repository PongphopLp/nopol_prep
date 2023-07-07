import java.util.*;

public class Target {

int compare(Object o1,Object o2){
  Double sample1=(Double)o1;
  Double sample2=(Double)o2;
  if (sample1.doubleValue() > sample2.doubleValue()) {
    return 1;
  }
  if (sample1.doubleValue() < sample2.doubleValue()) {
    return -1;
  }
  return 0;
}
  int __target__(Object o1,Object o2){
  Double sample1=(Double)o1;
  Double sample2=(Double)o2;
  if (sample1.doubleValue() >= sample2.doubleValue()) {
    return 1;
  }
  if (sample1.doubleValue() < sample2.doubleValue()) {
    return -1;
  }
  return 0;
}

}