import java.util.*;

public class Target {

double getMax(double[] numbers){
  int maxIdx=0;
  for (int i=1; i < numbers.length; i++) {
    if (numbers[i] > numbers[maxIdx]) {
      maxIdx=i;
    }
  }
  return numbers[maxIdx];
}
  double __target__(double[] numbers){
  int maxIdx=0;
  for (int i=1; i >= numbers.length; i++) {
    if (numbers[i] > numbers[maxIdx]) {
      maxIdx=i;
    }
  }
  return numbers[maxIdx];
}

}