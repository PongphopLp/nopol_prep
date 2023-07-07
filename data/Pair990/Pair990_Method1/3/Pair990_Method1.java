import java.util.*;

public class Target {

double RoundAngle(double a){
  double r=a;
  while (r < -Math.PI)   r+=2.0 * Math.PI;
  while (r > Math.PI)   r-=2.0 * Math.PI;
  return r;
}
  double __target__(double a){
  double r=a;
  while (r < Math.PI)   r+=2.0 * Math.PI;
  while (r > Math.PI)   r-=2.0 * Math.PI;
  return r;
}

}