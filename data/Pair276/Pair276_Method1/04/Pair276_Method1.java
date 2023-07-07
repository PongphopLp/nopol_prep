import java.util.*;

public class Target {

double Angle(double x,double y){
  double a;
  if (x != 0.0) {
    if (y != 0.0)     a=Math.atan(y / x);
 else     a=(x < 0.0) ? Math.PI : 0.0;
  }
 else   a=(y < 0.0) ? -Math.PI / 2 : Math.PI / 2;
  if (a < 0.0)   a+=Math.PI;
  if (y < 0.0)   a+=Math.PI;
  return a;
}
  double __target__(double x,double y){
  double a;
  if (x != 0.0) {
    if (y != 0.0)     a=Math.atan(y / x);
 else     a=(x < 0.0) ? Math.PI : 0.0;
  }
 else   a=(y < 0.0) ? -Math.PI / 2 : Math.PI * 2;
  if (a < 0.0)   a+=Math.PI;
  if (y < 0.0)   a+=Math.PI;
  return a;
}

}