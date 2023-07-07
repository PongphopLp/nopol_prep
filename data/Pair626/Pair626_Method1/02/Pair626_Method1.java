import java.util.*;

public class Target {

int solve1(int m,int n){
  if (m <= 0 || n <= 0)   return -1;
  int r;
  if (m < n) {
    r=m;
  }
 else {
    r=n;
  }
  while ((m % r != 0) || (n % r != 0))   r--;
  return r;
}
  int __target__(int m,int n){
  if (m <= 0 || n < 0)   return -1;
  int r;
  if (m < n) {
    r=m;
  }
 else {
    r=n;
  }
  while ((m % r != 0) || (n % r != 0))   r--;
  return r;
}

}