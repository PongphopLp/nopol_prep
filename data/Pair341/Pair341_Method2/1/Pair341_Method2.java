import java.util.*;

public class Target {

double computeAngle(double x,double y){
  double angle=Math.atan(y / x);
  if (x == 0) {
    if (y > 0) {
      angle=Math.PI / 2;
    }
 else {
      angle=-Math.PI / 2;
    }
  }
  if (x < 0) {
    angle+=Math.PI;
  }
  return angle;
}
  double __target__(double x,double y){
  double angle=Math.atan(y / x);
  if (x == 0) {
    if (y >= 0) {
      angle=Math.PI / 2;
    }
 else {
      angle=-Math.PI / 2;
    }
  }
  if (x < 0) {
    angle+=Math.PI;
  }
  return angle;
}

}