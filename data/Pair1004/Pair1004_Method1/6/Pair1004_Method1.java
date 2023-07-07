import java.util.*;

public class Target {

int getMax(int[] numbers){
  if (numbers == null || numbers.length == 0) {
    return 0;
  }
  int curMax=numbers[0];
  for (int i=1; i < numbers.length; i++) {
    if (numbers[i] > curMax) {
      curMax=numbers[i];
    }
  }
  return curMax;
}
  int __target__(int[] numbers){
  if (numbers == null || numbers.length == 0) {
    return 0;
  }
  int curMax=numbers[0];
  for (int i=1; i < numbers.length; i++) {
    if (numbers[i] >= curMax) {
      curMax=numbers[i];
    }
  }
  return curMax;
}

}