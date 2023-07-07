import java.util.*;

public class Target {

double hypot(double x,double y){
  if (x < 0.) {
    x=-x;
  }
 else   if (x == 0.) {
    return (y < 0.0 ? -y : y);
  }
  if (y < 0.) {
    y=-y;
  }
 else   if (y == 0.) {
    return (x);
  }
  if (x < y) {
    x/=y;
    return (y * Math.sqrt(1.0 + x * x));
  }
 else {
    y/=x;
    return (x * Math.sqrt(1.0 + y * y));
  }
}
  double __target__(double x,double y){
  if (x < 0.) {
    x=-x;
  }
 else   if (x == 0.) {
    return (y < 0.0 ? -y : y);
  }
  if (y < 0.) {
    y=-y;
  }
 else   if (y == 0.) {
    return (x);
  }
  if (x < y) {
    x/=y;
    return (y * Math.sqrt(1.0 + x * x));
  }
 else {
    y/=x;
    return (x / Math.sqrt(1.0 + y * y));
  }
}

}