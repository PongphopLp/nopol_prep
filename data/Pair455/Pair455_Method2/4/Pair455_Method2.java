import java.util.*;

public class Target {

int modulo(int number,int divisor){
  if (number >= 0) {
    return number % divisor;
  }
  return ((number % divisor) + divisor) % divisor;
}
  int __target__(int number,int divisor){
  if (number >= 0) {
    return number % divisor;
  }
  return ((number % divisor) + divisor) * divisor;
}

}