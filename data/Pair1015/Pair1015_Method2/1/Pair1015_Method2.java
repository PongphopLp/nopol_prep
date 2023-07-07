import java.util.*;

public class Target {

int min(int[] numbers){
  int min=numbers[0];
  for (int i=1; i < numbers.length; ++i)   if (numbers[i] < min)   min=numbers[i];
  return min;
}
  int __target__(int[] numbers){
  int min=numbers[0];
  for (int i=1; i <= numbers.length; ++i)   if (numbers[i] < min)   min=numbers[i];
  return min;
}

}