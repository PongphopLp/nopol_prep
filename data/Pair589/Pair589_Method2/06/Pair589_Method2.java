import java.util.*;

public class Target {

int pow(int base,int exp){
  if (exp == 0)   return 1;
 else   if (exp > 0) {
    long result=base;
    for (int i=1; i < exp; i++) {
      if (result >= Integer.MAX_VALUE) {
        return Integer.MAX_VALUE;
      }
      result*=base;
    }
    return (int)result;
  }
 else {
    int result=1;
    for (int i=1; i < exp; i++) {
      result/=base;
      if (result == 0)       return 0;
    }
    return result;
  }
}
  int __target__(int base,int exp){
  if (exp == 0)   return 1;
 else   if (exp > 0) {
    long result=base;
    for (int i=1; i < exp; i++) {
      if (result < Integer.MAX_VALUE) {
        return Integer.MAX_VALUE;
      }
      result*=base;
    }
    return (int)result;
  }
 else {
    int result=1;
    for (int i=1; i < exp; i++) {
      result/=base;
      if (result == 0)       return 0;
    }
    return result;
  }
}

}