import java.util.*;

public class Target {

double clamp(double value,double min,double max){
  if (value <= max && value >= min) {
    return value;
  }
 else   if (max < value) {
    return max;
  }
 else {
    return min;
  }
}
  double __target__(double value,double min,double max){
  if (value <= max && value < min) {
    return value;
  }
 else   if (max < value) {
    return max;
  }
 else {
    return min;
  }
}

}