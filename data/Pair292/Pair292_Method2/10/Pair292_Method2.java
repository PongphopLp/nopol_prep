import java.util.*;

public class Target {

double moduloMatLab(double divider,double quotient){
  if (quotient == 0) {
    return divider;
  }
  double ret=divider % quotient;
  if ((ret >= 0 && quotient < 0) || (ret < 0 && quotient >= 0)) {
    ret+=quotient;
  }
  return ret;
}
  double __target__(double divider,double quotient){
  if (quotient == 0) {
    return divider;
  }
  double ret=divider % quotient;
  if ((ret >= 0 && quotient < 0) || (ret < 0 && quotient < 0)) {
    ret+=quotient;
  }
  return ret;
}

}