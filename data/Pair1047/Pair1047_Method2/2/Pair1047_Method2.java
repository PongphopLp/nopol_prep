import java.util.*;

public class Target {

int getMaxValue(int[] values){
  int max=values[0];
  for (  int value : values) {
    if (value > max) {
      max=value;
    }
  }
  return max;
}
  int __target__(int[] values){
  int max=values[0];
  for (  int value : values) {
    if (value <= max) {
      max=value;
    }
  }
  return max;
}

}