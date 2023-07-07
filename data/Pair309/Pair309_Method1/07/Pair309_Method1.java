import java.util.*;

public class Target {

double gain(double a,double b){
  double p=Math.log(1. - b) / Math.log(0.5);
  if (a < .001) {
    return 0.;
  }
 else   if (a > .999) {
    return 1.;
  }
  if (a < 0.5) {
    return Math.pow(2 * a,p) / 2;
  }
 else {
    return 1. - (Math.pow(2 * (1. - a),p) / 2);
  }
}
  double __target__(double a,double b){
  double p=Math.log(1. + b) / Math.log(0.5);
  if (a < .001) {
    return 0.;
  }
 else   if (a > .999) {
    return 1.;
  }
  if (a < 0.5) {
    return Math.pow(2 * a,p) / 2;
  }
 else {
    return 1. - (Math.pow(2 * (1. - a),p) / 2);
  }
}

}