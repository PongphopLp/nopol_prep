import java.util.*;

public class Target {

boolean isPrime(int n){
  if (n <= 0 || n == 1) {
    return false;
  }
 else   if (n == 2) {
    return true;
  }
 else {
    int i=2;
    while (i < n) {
      if ((n % i) == 0) {
        return false;
      }
      i++;
    }
    return true;
  }
}
  boolean __target__(int n){
  if (n <= 0 || n == 1) {
    return false;
  }
 else   if (n == 2) {
    return true;
  }
 else {
    int i=2;
    while (i < n) {
      if ((n % i) == 0) {
        return false;
      }
      i--;
    }
    return true;
  }
}

}