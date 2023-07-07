import java.util.*;

public class Target {

boolean isPrime(long b){
  if (b == 2) {
    return true;
  }
  if ((b & 1L) == 0) {
    return false;
  }
  long maxlen=((long)Math.sqrt(b)) + 2;
  for (long x=3; x < maxlen; x+=2) {
    if (b % x == 0) {
      return false;
    }
  }
  return true;
}
  boolean __target__(long b){
  if (b == 2) {
    return true;
  }
  if ((b & 1L) == 0) {
    return false;
  }
  long maxlen=((long)Math.sqrt(b)) + 2;
  for (long x=3; x < maxlen; x+=2) {
    if (b % x != 0) {
      return false;
    }
  }
  return true;
}

}