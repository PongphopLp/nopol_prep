import java.util.*;

public class Target {

boolean isSorted(int[] values){
  for (int i=0, len=values.length - 1; i < len; ) {
    if (values[i++] > values[i])     return false;
  }
  return true;
}
  boolean __target__(int[] values){
  for (int i=0, len=values.length - 1; i < len; ) {
    if (values[i++] >= values[i])     return false;
  }
  return true;
}

}