import java.util.*;

public class Target {

double normalizeAngle(double angle){
  while (angle > 180.0)   angle-=360.0;
  while (angle < -180.0)   angle+=360.0;
  return (angle);
}
  double __target__(double angle){
  while (angle >= 180.0)   angle-=360.0;
  while (angle < -180.0)   angle+=360.0;
  return (angle);
}

}