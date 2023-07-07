import java.util.*;

public class Target {

int max(int[] numbers){
  int max=numbers[0];
  for (int i=1; i < numbers.length; ++i)   if (numbers[i] > max)   max=numbers[i];
  return max;
}
  int __target__(int[] numbers){
  int max=numbers[0];
  for (int i=1; i < numbers.length; --i)   if (numbers[i] > max)   max=numbers[i];
  return max;
}

}