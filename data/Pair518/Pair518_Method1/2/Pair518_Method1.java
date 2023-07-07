import java.util.*;

public class Target {

float parse(String s){
  if (s == null || s.length() == 0) {
    return 0.0f;
  }
 else {
    return Float.parseFloat(s);
  }
}
  float __target__(String s){
  if (s == null || s.length() != 0) {
    return 0.0f;
  }
 else {
    return Float.parseFloat(s);
  }
}

}