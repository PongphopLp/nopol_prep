import java.util.*;

public class Target {

int castLong2Int(long x){
  if (x >= Integer.MAX_VALUE) {
    return Integer.MAX_VALUE;
  }
 else   if (x <= Integer.MIN_VALUE) {
    return Integer.MIN_VALUE;
  }
  return (int)x;
}
  int __target__(long x){
  if (x >= Integer.MAX_VALUE) {
    return Integer.MAX_VALUE;
  }
 else   if (x < Integer.MIN_VALUE) {
    return Integer.MIN_VALUE;
  }
  return (int)x;
}

}