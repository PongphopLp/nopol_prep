import java.util.*;

public class Target {

long plusNoModulo(long a,long b){
  if ((a ^ b) < 0) {
    return a + b;
  }
 else {
    long sum=a + b;
    if ((a ^ sum) < 0) {
      return (sum >= 0) ? Long.MIN_VALUE : Long.MAX_VALUE;
    }
 else {
      return sum;
    }
  }
}
  long __target__(long a,long b){
  if ((a ^ b) <= 0) {
    return a + b;
  }
 else {
    long sum=a + b;
    if ((a ^ sum) < 0) {
      return (sum >= 0) ? Long.MIN_VALUE : Long.MAX_VALUE;
    }
 else {
      return sum;
    }
  }
}

}