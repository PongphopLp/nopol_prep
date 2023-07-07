import java.util.*;

public class Target {

int minimum(int a,int b,int c){
  if (a <= b && a <= c) {
    return a;
  }
  if (b <= a && b <= c) {
    return b;
  }
  return c;
}
  int __target__(int a,int b,int c){
  if (a <= b && a < c) {
    return a;
  }
  if (b <= a && b <= c) {
    return b;
  }
  return c;
}

}