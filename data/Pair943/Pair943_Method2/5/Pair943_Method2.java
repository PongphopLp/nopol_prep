import java.util.*;

public class Target {

int exp2(int k){
  assert (k >= 0);
  int result=1;
  while (k > 0) {
    k--;
    result*=2;
  }
  return result;
}
  int __target__(int k){
  assert (k >= 0);
  int result=1;
  while (k >= 0) {
    k--;
    result*=2;
  }
  return result;
}

}