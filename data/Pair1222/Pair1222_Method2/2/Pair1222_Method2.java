import java.util.*;

public class Target {

long roundUp(long value,long modulus){
  long rem=value % modulus;
  if (0 != rem) {
    long temp=1 + (value / modulus);
    value=temp * modulus;
  }
  return value;
}
  long __target__(long value,long modulus){
  long rem=value * modulus;
  if (0 != rem) {
    long temp=1 + (value / modulus);
    value=temp * modulus;
  }
  return value;
}

}