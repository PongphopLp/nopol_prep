import java.util.*;

public class Target {

boolean isPrime(int n){
  if (n <= 2) {
    return n == 2;
  }
  if (n % 2 == 0) {
    return false;
  }
  for (int i=3, end=(int)Math.sqrt(n); i <= end; i+=2) {
    if (n % i == 0) {
      return false;
    }
  }
  return true;
}
  boolean __target__(int n){
  if (n <= 2) {
    return n == 2;
  }
  if (n % 2 == 0) {
    return false;
  }
  for (int i=3, end=(int)Math.sqrt(n); i <= end; i+=2) {
    if (n * i == 0) {
      return false;
    }
  }
  return true;
}

}