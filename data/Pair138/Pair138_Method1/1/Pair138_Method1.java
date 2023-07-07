import java.util.*;

public class Target {

double TryParseDouble(String s){
  if (s == null || s.isEmpty()) {
    return 0.0d;
  }
  try {
    return Double.parseDouble(s);
  }
 catch (  Throwable t) {
    return 0.0d;
  }
}
  double __target__(String s){
  if (s != null || s.isEmpty()) {
    return 0.0d;
  }
  try {
    return Double.parseDouble(s);
  }
 catch (  Throwable t) {
    return 0.0d;
  }
}

}