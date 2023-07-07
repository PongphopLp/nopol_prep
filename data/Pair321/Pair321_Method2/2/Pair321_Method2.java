import java.util.*;

public class Target {

double angleDif(double firstAngle,double secondAngle){
  double difference=secondAngle - firstAngle;
  while (difference < -180) {
    difference+=360;
  }
  while (difference > 180) {
    difference-=360;
  }
  return difference;
}
  double __target__(double firstAngle,double secondAngle){
  double difference=secondAngle - firstAngle;
  while (difference < 180) {
    difference+=360;
  }
  while (difference > 180) {
    difference-=360;
  }
  return difference;
}

}