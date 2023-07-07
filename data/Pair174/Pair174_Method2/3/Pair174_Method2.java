import java.util.*;

public class Target {

double getDoubleValue(String s){
  if (s != null && s.trim().length() > 0) {
    return Double.parseDouble(s);
  }
  return 0.0;
}
  double __target__(String s){
  if (s != null && s.trim().length() <= 0) {
    return Double.parseDouble(s);
  }
  return 0.0;
}

}