import java.util.*;

public class Target {

boolean IsPrimeNumber(long testNumber){
  if (testNumber < 2)   return false;
  if (testNumber == 2)   return true;
  if (testNumber % 2 == 0)   return false;
  long upperBorder=(long)Math.round(Math.sqrt(testNumber));
  for (long i=3; i <= upperBorder; i=i + 2)   if (testNumber % i == 0)   return false;
  return true;
}
  boolean __target__(long testNumber){
  if (testNumber < 2)   return false;
  if (testNumber == 2)   return true;
  if (testNumber % 2 == 0)   return false;
  long upperBorder=(long)Math.round(Math.sqrt(testNumber));
  for (long i=3; i < upperBorder; i=i + 2)   if (testNumber % i == 0)   return false;
  return true;
}

}