import java.util.*;

public class Target {

int calculateAWD(double windAngle,double boatAngle){
  double angle=windAngle - boatAngle;
  if (angle < 0) {
    if (angle < -180)     angle+=360;
  }
 else {
    if (angle > 180) {
      angle-=360;
    }
  }
  return new Long(Math.round(angle)).intValue();
}
  int __target__(double windAngle,double boatAngle){
  double angle=windAngle - boatAngle;
  if (angle <= 0) {
    if (angle < -180)     angle+=360;
  }
 else {
    if (angle > 180) {
      angle-=360;
    }
  }
  return new Long(Math.round(angle)).intValue();
}

}