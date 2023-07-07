import java.util.*;

public class Target {

long max(long[] values){
  long max=values[0];
  for (  long l : values) {
    if (l > max) {
      max=l;
    }
  }
  return max;
}
  long __target__(long[] values){
  long max=values[0];
  for (  long l : values) {
    if (l <= max) {
      max=l;
    }
  }
  return max;
}

}