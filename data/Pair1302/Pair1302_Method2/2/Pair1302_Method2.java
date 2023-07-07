import java.util.*;

public class Target {

int convertLongToInt(long l){
  if (l <= Integer.MIN_VALUE) {
    return Integer.MIN_VALUE;
  }
 else   if (l >= Integer.MAX_VALUE) {
    return Integer.MAX_VALUE;
  }
 else {
    return (int)l;
  }
}
  int __target__(long l){
  if (l <= Integer.MIN_VALUE) {
    return Integer.MIN_VALUE;
  }
 else   if (l > Integer.MAX_VALUE) {
    return Integer.MAX_VALUE;
  }
 else {
    return (int)l;
  }
}

}