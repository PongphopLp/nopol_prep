import java.util.*;

public class Target {

int getMax(int a,int b,int c){
  if (b > a) {
    a=b;
  }
  if (c > a) {
    a=c;
  }
  return a;
}
  int __target__(int a,int b,int c){
  if (b > a) {
    a=b;
  }
  if (c <= a) {
    a=c;
  }
  return a;
}

}