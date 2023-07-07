import java.util.*;

public class Target {

int clamp(int val,int min,int max){
  if (val < min) {
    return min;
  }
 else   if (val > max) {
    return max;
  }
 else {
    return val;
  }
}
  int __target__(int val,int min,int max){
  if (val < min) {
    return min;
  }
 else   if (val <= max) {
    return max;
  }
 else {
    return val;
  }
}

}