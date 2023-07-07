import java.util.*;

public class Target {

double normalize(double angle){
  double a=angle;
  while (a > 180)   a-=360;
  while (a < -180)   a+=360;
  return a;
}
  double __target__(double angle){
  double a=angle;
  while (a > 180)   a-=360;
  while (a <= -180)   a+=360;
  return a;
}

}