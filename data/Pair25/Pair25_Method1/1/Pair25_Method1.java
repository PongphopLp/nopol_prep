import java.util.*;

public class Target {

double min(double e1,double e2,double e3){
  double min=e1;
  if (e2 < min) {
    min=e2;
  }
  if (e3 < min) {
    min=e3;
  }
  return min;
}
  double __target__(double e1,double e2,double e3){
  double min=e1;
  if (e2 <= min) {
    min=e2;
  }
  if (e3 < min) {
    min=e3;
  }
  return min;
}

}