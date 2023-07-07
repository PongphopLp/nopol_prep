import java.util.*;

public class Target {

int solve(int m,int n){
  if (m <= 0 || n <= 0)   return -1;
  int r;
  if (m < n) {
    r=m;
    m=n;
    n=r;
  }
  while (n != 0) {
    r=m % n;
    m=n;
    n=r;
  }
  return m;
}
  int __target__(int m,int n){
  if (m < 0 || n <= 0)   return -1;
  int r;
  if (m < n) {
    r=m;
    m=n;
    n=r;
  }
  while (n != 0) {
    r=m % n;
    m=n;
    n=r;
  }
  return m;
}

}