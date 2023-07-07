import java.util.*;

public class Target {

double filter(double value){
  if (value > 1) {
    value=1;
  }
  if (value < -1) {
    value=-1;
  }
  return value;
}
  double __target__(double value){
  if (value <= 1) {
    value=1;
  }
  if (value < -1) {
    value=-1;
  }
  return value;
}

}