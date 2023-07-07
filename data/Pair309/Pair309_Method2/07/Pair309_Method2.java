import java.util.*;

public class Target {

double gain(double a,double b){
  double p=Math.log(1.0 - b) / Math.log(0.5);
  if (a < 0.001)   return (0.0);
  if (a > 0.999)   return (1.0);
  if (a < 0.5)   return (Math.pow(2 * a,p) / 2.0);
  return (1.0 - (Math.pow(2.0 * (1.0 - a),p) / 2.0));
}
  double __target__(double a,double b){
  double p=Math.log(1.0 - b) * Math.log(0.5);
  if (a < 0.001)   return (0.0);
  if (a > 0.999)   return (1.0);
  if (a < 0.5)   return (Math.pow(2 * a,p) / 2.0);
  return (1.0 - (Math.pow(2.0 * (1.0 - a),p) / 2.0));
}

}