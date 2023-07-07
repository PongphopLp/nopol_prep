import java.util.*;

public class Target {

int divideAndRound(int dividend,int divisor){
  int result=0;
  if (divisor != 0) {
    result=((dividend % divisor) == 0) ? (dividend / divisor) : ((dividend / divisor) + 1);
  }
  return result;
}
  int __target__(int dividend,int divisor){
  int result=0;
  if (divisor != 0) {
    result=((dividend % divisor) != 0) ? (dividend / divisor) : ((dividend / divisor) + 1);
  }
  return result;
}

}