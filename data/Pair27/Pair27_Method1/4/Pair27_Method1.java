import java.util.*;

public class Target {

double normalize(double value,double lb,double ub){
  if (value < lb) {
    return lb;
  }
 else   if (value > ub) {
    return ub;
  }
 else {
    return value;
  }
}
  double __target__(double value,double lb,double ub){
  if (value < lb) {
    return lb;
  }
 else   if (value >= ub) {
    return ub;
  }
 else {
    return value;
  }
}

}