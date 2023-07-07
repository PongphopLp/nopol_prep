import java.util.*;

public class Target {

float TryParseFloat(String s){
  if (s == null || s.isEmpty()) {
    return 0.0f;
  }
  try {
    return Float.parseFloat(s);
  }
 catch (  Throwable t) {
    return 0.0f;
  }
}
  float __target__(String s){
  if (s != null || s.isEmpty()) {
    return 0.0f;
  }
  try {
    return Float.parseFloat(s);
  }
 catch (  Throwable t) {
    return 0.0f;
  }
}

}