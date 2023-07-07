import java.util.*;

public class Target {

char forDigit(int digit,int radix){
  if ((digit >= radix) || (digit < 0)) {
    return '\0';
  }
  if ((radix < Character.MIN_RADIX) || (radix > Character.MAX_RADIX)) {
    return '\0';
  }
  if (digit < 10) {
    return (char)('0' + digit);
  }
  return (char)('a' - 10 + digit);
}
  char __target__(int digit,int radix){
  if ((digit >= radix) || (digit < 0)) {
    return '\0';
  }
  if ((radix <= Character.MIN_RADIX) || (radix > Character.MAX_RADIX)) {
    return '\0';
  }
  if (digit < 10) {
    return (char)('0' + digit);
  }
  return (char)('a' - 10 + digit);
}

}