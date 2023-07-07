import java.util.*;

public class Target {

int clamp(long value){
  if (value < Integer.MIN_VALUE)   return Integer.MIN_VALUE;
  if (value > Integer.MAX_VALUE)   return Integer.MAX_VALUE;
  return (int)value;
}
  int __target__(long value){
  if (value >= Integer.MIN_VALUE)   return Integer.MIN_VALUE;
  if (value > Integer.MAX_VALUE)   return Integer.MAX_VALUE;
  return (int)value;
}

}