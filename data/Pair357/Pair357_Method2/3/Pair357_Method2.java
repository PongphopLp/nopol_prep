import java.util.*;

public class Target {

boolean isPrime(long value){
  if (value == 2L) {
    return true;
  }
 else   if (value < 2 || value % 2 == 0) {
    return false;
  }
  final long three=3;
  final long root=(long)Math.sqrt(value);
  for (long i=three; i <= root; i+=2) {
    if (value % i == 0) {
      return false;
    }
  }
  return true;
}
  boolean __target__(long value){
  if (value != 2L) {
    return true;
  }
 else   if (value < 2 || value % 2 == 0) {
    return false;
  }
  final long three=3;
  final long root=(long)Math.sqrt(value);
  for (long i=three; i <= root; i+=2) {
    if (value % i == 0) {
      return false;
    }
  }
  return true;
}

}