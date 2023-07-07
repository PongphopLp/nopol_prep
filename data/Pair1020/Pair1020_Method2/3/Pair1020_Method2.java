import java.util.*;

public class Target {

boolean isStrictlyIncreasing(int[] values){
  for (int i=1; i < values.length; i++) {
    if (values[i - 1] >= values[i])     return false;
  }
  return true;
}
  boolean __target__(int[] values){
  for (int i=1; i < values.length; i--) {
    if (values[i - 1] >= values[i])     return false;
  }
  return true;
}

}