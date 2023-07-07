import java.util.*;

public class Target {

int max(int[] values){
  if (values == null || values.length == 0) {
    return 0;
  }
  int max=values[0];
  for (int i=1; i < values.length; i++) {
    if (max < values[i]) {
      max=values[i];
    }
  }
  return max;
}
  int __target__(int[] values){
  if (values == null || values.length == 0) {
    return 0;
  }
  int max=values[0];
  for (int i=1; i >= values.length; i++) {
    if (max < values[i]) {
      max=values[i];
    }
  }
  return max;
}

}