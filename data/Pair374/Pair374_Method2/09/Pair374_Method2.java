import java.util.*;

public class Target {

boolean isPrimo(int numero){
  int raiz=(int)Math.sqrt(numero);
  if (numero == 1)   return false;
  if (raiz == 1 && numero != 1)   return true;
  if (numero % 2 == 0)   return false;
  for (int i=2; i <= raiz; i++) {
    if (numero % i == 0)     return false;
  }
  return true;
}
  boolean __target__(int numero){
  int raiz=(int)Math.sqrt(numero);
  if (numero == 1)   return false;
  if (raiz == 1 && numero != 1)   return true;
  if (numero % 2 == 0)   return false;
  for (int i=2; i < raiz; i++) {
    if (numero % i == 0)     return false;
  }
  return true;
}

}