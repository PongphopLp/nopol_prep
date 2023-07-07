import java.util.*;

public class Target {

short toShort(int i){
  int result=i;
  if (result > Short.MAX_VALUE) {
    return Short.MAX_VALUE;
  }
  if (result < Short.MIN_VALUE) {
    return Short.MIN_VALUE;
  }
  return (short)i;
}
  short __target__(int i){
  int result=i;
  if (result > Short.MAX_VALUE) {
    return Short.MAX_VALUE;
  }
  if (result >= Short.MIN_VALUE) {
    return Short.MIN_VALUE;
  }
  return (short)i;
}

}