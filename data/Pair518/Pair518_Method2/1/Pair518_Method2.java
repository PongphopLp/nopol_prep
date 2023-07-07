import java.util.*;

public class Target {

float getFloat(String value){
  if (value != null && !value.equals("")) {
    return Float.parseFloat(value);
  }
  return 0;
}
  float __target__(String value){
  if (value == null && !value.equals("")) {
    return Float.parseFloat(value);
  }
  return 0;
}

}