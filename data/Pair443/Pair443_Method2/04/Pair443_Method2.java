import java.util.*;

public class Target {

boolean isPrime(int i){
  if (i == 2)   return true;
  if (i < 2 || i % 2 == 0)   return false;
  for (int stop=i, j=3; j < stop; stop=i / j, j+=2)   if (i % j == 0)   return false;
  return true;
}
  boolean __target__(int i){
  if (i == 2)   return true;
  if (i < 2 || i % 2 == 0)   return false;
  for (int stop=i, j=3; j < stop; stop=i * j, j+=2)   if (i % j == 0)   return false;
  return true;
}

}