import java.util.*;

public class Target {

double getAngle(double xDiff,double yDiff){
  double angle=0;
  if ((xDiff >= 0) && (yDiff >= 0)) {
    angle=Math.atan(yDiff / xDiff);
  }
 else   if ((xDiff < 0) && (yDiff >= 0)) {
    angle=Math.PI + Math.atan(yDiff / xDiff);
  }
 else   if ((xDiff < 0) && (yDiff < 0)) {
    angle=Math.PI + Math.atan(yDiff / xDiff);
  }
 else   if ((xDiff >= 0) && (yDiff < 0)) {
    angle=(2 * Math.PI) + Math.atan(yDiff / xDiff);
  }
  return angle;
}
  double __target__(double xDiff,double yDiff){
  double angle=0;
  if ((xDiff >= 0) && (yDiff >= 0)) {
    angle=Math.atan(yDiff / xDiff);
  }
 else   if ((xDiff < 0) && (yDiff < 0)) {
    angle=Math.PI + Math.atan(yDiff / xDiff);
  }
 else   if ((xDiff < 0) && (yDiff < 0)) {
    angle=Math.PI + Math.atan(yDiff / xDiff);
  }
 else   if ((xDiff >= 0) && (yDiff < 0)) {
    angle=(2 * Math.PI) + Math.atan(yDiff / xDiff);
  }
  return angle;
}

}