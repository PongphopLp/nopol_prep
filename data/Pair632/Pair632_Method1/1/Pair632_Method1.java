import java.util.*;

public class Target {

int getMinimum(int a,int b,int c){
  int minimum=a;
  if (b < minimum) {
    minimum=b;
  }
  if (c < minimum) {
    minimum=c;
  }
  return minimum;
}
  int __target__(int a,int b,int c){
  int minimum=a;
  if (b <= minimum) {
    minimum=b;
  }
  if (c < minimum) {
    minimum=c;
  }
  return minimum;
}

}