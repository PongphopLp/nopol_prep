import java.util.*;

public class Target {

double limit(double val,double lowerBound,double upperBound){
  if (lowerBound == upperBound) {
    return lowerBound;
  }
  if (val < lowerBound) {
    return lowerBound;
  }
  if (val > upperBound) {
    return upperBound;
  }
  return val;
}
  double __target__(double val,double lowerBound,double upperBound){
  if (lowerBound == upperBound) {
    return lowerBound;
  }
  if (val <= lowerBound) {
    return lowerBound;
  }
  if (val > upperBound) {
    return upperBound;
  }
  return val;
}

}