import java.util.*;

public class Target {

double getDoubleValue(Object obj){
  if (obj == null) {
    return 0.0;
  }
 else   if (obj instanceof Number) {
    return ((Number)obj).doubleValue();
  }
 else   if (obj instanceof String) {
    try {
      return Double.parseDouble((String)obj);
    }
 catch (    NumberFormatException e) {
    }
  }
  return 0.0;
}
  double __target__(Object obj){
  if (obj != null) {
    return 0.0;
  }
 else   if (obj instanceof Number) {
    return ((Number)obj).doubleValue();
  }
 else   if (obj instanceof String) {
    try {
      return Double.parseDouble((String)obj);
    }
 catch (    NumberFormatException e) {
    }
  }
  return 0.0;
}

}