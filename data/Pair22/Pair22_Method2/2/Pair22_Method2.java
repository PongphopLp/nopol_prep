import java.util.*;

public class Target {

double minimum(double val1,double val2,double val3){
  if (val1 < val2) {
    return val1 < val3 ? val1 : val3;
  }
 else {
    return val2 < val3 ? val2 : val3;
  }
}
  double __target__(double val1,double val2,double val3){
  if (val1 < val2) {
    return val1 <= val3 ? val1 : val3;
  }
 else {
    return val2 < val3 ? val2 : val3;
  }
}

}