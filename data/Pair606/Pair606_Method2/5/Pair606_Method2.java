import java.util.*;

public class Target {

int divideAndRound(int dividend,int divisor){
  if (divisor == 0) {
    return 0;
  }
  return ((dividend % divisor) == 0) ? (dividend / divisor) : ((dividend / divisor) + 1);
}
  int __target__(int dividend,int divisor){
  if (divisor == 0) {
    return 0;
  }
  return ((dividend % divisor) == 0) ? (dividend / divisor) : ((dividend / divisor) - 1);
}

}