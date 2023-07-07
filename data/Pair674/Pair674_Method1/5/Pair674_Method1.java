import java.util.*;

public class Target {

int getClosestPowerOf2(int value){
  if (value < 1) {
    return value;
  }
  int powerValue=1;
  for (; ; ) {
    powerValue*=2;
    if (value < powerValue) {
      int minBound=powerValue / 2;
      if ((powerValue - value) > (value - minBound)) {
        return minBound;
      }
 else {
        return powerValue;
      }
    }
  }
}
  int __target__(int value){
  if (value < 1) {
    return value;
  }
  int powerValue=1;
  for (; ; ) {
    powerValue*=2;
    if (value < powerValue) {
      int minBound=powerValue / 2;
      if ((powerValue + value) > (value - minBound)) {
        return minBound;
      }
 else {
        return powerValue;
      }
    }
  }
}

}