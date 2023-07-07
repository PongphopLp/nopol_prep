import java.util.*;

public class Target {

int pow2(int exponent){
  int res=1;
  if (exponent > 0) {
    for (int i=0; i < exponent; i++) {
      res*=2;
    }
  }
  return res;
}
  int __target__(int exponent){
  int res=1;
  if (exponent > 0) {
    for (int i=0; i <= exponent; i++) {
      res*=2;
    }
  }
  return res;
}

}