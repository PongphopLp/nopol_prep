import java.util.*;

public class Target {

double getMin(double[] numbers){
  int minIdx=0;
  for (int i=1; i < numbers.length; i++) {
    if (numbers[i] < numbers[minIdx]) {
      minIdx=i;
    }
  }
  return numbers[minIdx];
}
  double __target__(double[] numbers){
  int minIdx=0;
  for (int i=1; i >= numbers.length; i++) {
    if (numbers[i] < numbers[minIdx]) {
      minIdx=i;
    }
  }
  return numbers[minIdx];
}

}