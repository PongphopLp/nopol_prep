import java.util.*;

public class Target {

boolean isPrime(long n){
  if (n == 2)   return true;
  if (n < 0 || n % 2 == 0) {
    return false;
  }
  long d=3;
  long s=(long)Math.ceil(Math.sqrt(n));
  while (d <= s) {
    if (n % d == 0)     return false;
    d+=2;
  }
  return true;
}
  boolean __target__(long n){
  if (n == 2)   return true;
  if (n <= 0 || n % 2 == 0) {
    return false;
  }
  long d=3;
  long s=(long)Math.ceil(Math.sqrt(n));
  while (d <= s) {
    if (n % d == 0)     return false;
    d+=2;
  }
  return true;
}

}