import java.util.*;

public class Target {

boolean isPrime(long number){
  if (number < 2)   return false;
  if (number == 2)   return true;
  if (number % 2 == 0)   return false;
  if (number == 3)   return true;
  if (number % 3 == 0)   return false;
  int y=2;
  int x=(int)Math.sqrt(number);
  for (int i=5; i <= x; i+=y, y=6 - y) {
    if (number % i == 0)     return false;
  }
  return true;
}
  boolean __target__(long number){
  if (number <= 2)   return false;
  if (number == 2)   return true;
  if (number % 2 == 0)   return false;
  if (number == 3)   return true;
  if (number % 3 == 0)   return false;
  int y=2;
  int x=(int)Math.sqrt(number);
  for (int i=5; i <= x; i+=y, y=6 - y) {
    if (number % i == 0)     return false;
  }
  return true;
}

}