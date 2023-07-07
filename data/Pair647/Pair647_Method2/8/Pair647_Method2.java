import java.util.*;

public class Target {

int max(int a,int b,int c){
  int max=0;
  if ((a >= b) && (a >= c)) {
    max=a;
  }
 else   if ((b >= a) && (b >= c)) {
    max=b;
  }
 else {
    max=c;
  }
  return max;
}
  int __target__(int a,int b,int c){
  int max=0;
  if ((a >= b) && (a >= c)) {
    max=a;
  }
 else   if ((b >= a) && (b < c)) {
    max=b;
  }
 else {
    max=c;
  }
  return max;
}

}