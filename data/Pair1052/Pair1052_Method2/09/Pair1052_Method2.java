import java.util.*;

public class Target {

double normalRelativeAngle(double angle){
  if (angle > -180 && angle <= 180)   return angle;
  double fixedAngle=angle;
  while (fixedAngle <= -180)   fixedAngle+=360;
  while (fixedAngle > 180)   fixedAngle-=360;
  return fixedAngle;
}
  double __target__(double angle){
  if (angle > -180 && angle <= 180)   return angle;
  double fixedAngle=angle;
  while (fixedAngle < -180)   fixedAngle+=360;
  while (fixedAngle > 180)   fixedAngle-=360;
  return fixedAngle;
}

}