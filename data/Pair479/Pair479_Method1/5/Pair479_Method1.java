import java.util.*;

public class Target {

int pow(int base,int exponent){
  boolean reciprocal=false;
  if (exponent < 0) {
    reciprocal=true;
  }
  int result=1;
  while (exponent-- > 0) {
    result*=base;
  }
  return reciprocal ? 1 / result : result;
}
  int __target__(int base,int exponent){
  boolean reciprocal=false;
  if (exponent >= 0) {
    reciprocal=true;
  }
  int result=1;
  while (exponent-- > 0) {
    result*=base;
  }
  return reciprocal ? 1 / result : result;
}

}