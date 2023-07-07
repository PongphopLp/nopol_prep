import java.util.*;

public class Target {

long min(long[] values){
  long min=values[0];
  for (  long l : values) {
    if (l < min) {
      min=l;
    }
  }
  return min;
}
  long __target__(long[] values){
  long min=values[0];
  for (  long l : values) {
    if (l <= min) {
      min=l;
    }
  }
  return min;
}

}