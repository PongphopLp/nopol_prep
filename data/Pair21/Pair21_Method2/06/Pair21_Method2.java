import java.util.*;

public class Target {

double midOf3(double a,double b,double c){
  if (b > a) {
    if (c > b) {
      return b;
    }
    if (a > c) {
      return a;
    }
    return c;
  }
 else {
    if (c > a) {
      return a;
    }
    if (b > c) {
      return b;
    }
    return c;
  }
}
  double __target__(double a,double b,double c){
  if (b <= a) {
    if (c > b) {
      return b;
    }
    if (a > c) {
      return a;
    }
    return c;
  }
 else {
    if (c > a) {
      return a;
    }
    if (b > c) {
      return b;
    }
    return c;
  }
}

}