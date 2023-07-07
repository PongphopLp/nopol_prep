import java.util.*;

public class Target {

int mid_pred(int a,int b,int c){
  if (a > b) {
    if (c > b) {
      if (c > a)       b=a;
 else       b=c;
    }
  }
 else {
    if (b > c) {
      if (c > a)       b=c;
 else       b=a;
    }
  }
  return b;
}
  int __target__(int a,int b,int c){
  if (a > b) {
    if (c <= b) {
      if (c > a)       b=a;
 else       b=c;
    }
  }
 else {
    if (b > c) {
      if (c > a)       b=c;
 else       b=a;
    }
  }
  return b;
}

}