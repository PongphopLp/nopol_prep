import java.util.*;

public class Target {

double bestAngle(double angle){
  double newAngle=angle;
  if (angle > Math.PI)   newAngle-=(Math.PI * 2);
 else   if (angle < -Math.PI)   newAngle+=(Math.PI * 2);
  return newAngle;
}
  double __target__(double angle){
  double newAngle=angle;
  if (angle > Math.PI)   newAngle-=(Math.PI / 2);
 else   if (angle < -Math.PI)   newAngle+=(Math.PI * 2);
  return newAngle;
}

}