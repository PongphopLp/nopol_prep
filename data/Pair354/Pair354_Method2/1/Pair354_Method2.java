import java.util.*;

public class Target {

boolean esPrimo(long n){
  if (n == 2)   return true;
  if (n % 2 == 0)   return false;
  long raiz=(long)Math.sqrt(n);
  boolean ok=true;
  for (long div=3; div <= raiz; div+=2) {
    if (n % div == 0)     return false;
  }
  return true;
}
  boolean __target__(long n){
  if (n == 2)   return true;
  if (n % 2 == 0)   return false;
  long raiz=(long)Math.sqrt(n);
  boolean ok=true;
  for (long div=3; div < raiz; div+=2) {
    if (n % div == 0)     return false;
  }
  return true;
}

}