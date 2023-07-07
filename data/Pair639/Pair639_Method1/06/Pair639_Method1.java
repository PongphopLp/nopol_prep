import java.util.*;

public class Target {

int middle(int a,int b,int c){
  if (a > b) {
    if (b > c)     return b;
    if (a > c)     return c;
    return a;
  }
  if (a > c)   return a;
  if (b > c)   return c;
  return b;
}
  int __target__(int a,int b,int c){
  if (a <= b) {
    if (b > c)     return b;
    if (a > c)     return c;
    return a;
  }
  if (a > c)   return a;
  if (b > c)   return c;
  return b;
}

}