import java.util.*;

public class Target {

int bound(int value,int min,int max){
  if (value > max) {
    return max;
  }
  if (value < min) {
    return min;
  }
  return value;
}
  int __target__(int value,int min,int max){
  if (value > max) {
    return max;
  }
  if (value >= min) {
    return min;
  }
  return value;
}

}