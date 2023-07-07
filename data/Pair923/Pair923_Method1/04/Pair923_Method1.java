import java.util.*;

public class Target {

char forDigit(int digit,int radix){
  if (radix < 2 || radix > 36)   return '\0';
  if (digit < 0 || digit >= radix)   return '\0';
  return (char)(digit + ((digit < 10) ? '0' : ('a' - 10)));
}
  char __target__(int digit,int radix){
  if (radix < 2 || radix > 36)   return '\0';
  if (digit < 0 || digit > radix)   return '\0';
  return (char)(digit + ((digit < 10) ? '0' : ('a' - 10)));
}

}