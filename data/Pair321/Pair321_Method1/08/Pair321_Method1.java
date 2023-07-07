import java.util.*;

public class Target {

double difference(double angle1,double angle2){
  double delta=(angle2 - angle1) % 360;
  if (delta < -180)   return 360 + delta;
  if (delta > 180)   return delta - 360;
  return delta % 360;
}
  double __target__(double angle1,double angle2){
  double delta=(angle2 - angle1) % 360;
  if (delta < -180)   return 360 + delta;
  if (delta > 180)   return delta - 360;
  return delta * 360;
}

}