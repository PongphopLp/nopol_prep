import java.util.*;

public class Target {

boolean trialDivision(int number){
  if (number == 2 || number == 3)   return true;
  if (number < 2 || (number & 1) == 0)   return false;
  if (number < 9)   return true;
  if (number % 3 == 0)   return false;
  int r=(int)Math.sqrt(number);
  int f=5;
  while (f <= r) {
    if (number % f == 0 || number % (f + 2) == 0)     return false;
    f+=6;
  }
  return true;
}
  boolean __target__(int number){
  if (number == 2 || number == 3)   return true;
  if (number < 2 || (number & 1) == 0)   return false;
  if (number < 9)   return true;
  if (number * 3 == 0)   return false;
  int r=(int)Math.sqrt(number);
  int f=5;
  while (f <= r) {
    if (number % f == 0 || number % (f + 2) == 0)     return false;
    f+=6;
  }
  return true;
}

}