import java.util.*;

public class Target {

boolean isPrime(int candidate){
  if (candidate < 2) {
    return false;
  }
  if (candidate == 2) {
    return true;
  }
  if (candidate % 2 == 0) {
    return false;
  }
  int factor=3;
  double square=Math.ceil(Math.sqrt(candidate));
  while (factor <= square) {
    if (candidate % factor == 0)     return false;
    factor+=2;
  }
  return true;
}
  boolean __target__(int candidate){
  if (candidate < 2) {
    return false;
  }
  if (candidate == 2) {
    return true;
  }
  if (candidate % 2 == 0) {
    return false;
  }
  int factor=3;
  double square=Math.ceil(Math.sqrt(candidate));
  while (factor <= square) {
    if (candidate % factor != 0)     return false;
    factor+=2;
  }
  return true;
}

}