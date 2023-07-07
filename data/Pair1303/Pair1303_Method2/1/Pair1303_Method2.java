import java.util.*;

public class Target {

int toInt(long value){
  if (value < (long)Integer.MIN_VALUE) {
    return Integer.MIN_VALUE;
  }
 else   if (value > (long)Integer.MAX_VALUE) {
    return Integer.MAX_VALUE;
  }
 else {
    return (int)value;
  }
}
  int __target__(long value){
  if (value <= (long) Integer.MIN_VALUE) {
    return Integer.MIN_VALUE;
  }
 else   if (value > (long)Integer.MAX_VALUE) {
    return Integer.MAX_VALUE;
  }
 else {
    return (int)value;
  }
}

}