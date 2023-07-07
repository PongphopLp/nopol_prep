import java.util.*;

public class Target {

int saturate32(long x){
  if (x > Integer.MAX_VALUE)   return Integer.MAX_VALUE;
  if (x < Integer.MIN_VALUE)   return Integer.MIN_VALUE;
  return (int)x;
}
  int __target__(long x){
  if (x > Integer.MAX_VALUE)   return Integer.MAX_VALUE;
  if (x <= Integer.MIN_VALUE)   return Integer.MIN_VALUE;
  return (int)x;
}

}