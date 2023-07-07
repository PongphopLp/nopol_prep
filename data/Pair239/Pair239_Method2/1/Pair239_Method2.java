import java.util.*;

public class Target {

Double toDouble(Object value){
  if (value != null) {
    if (value instanceof Double) {
      return (Double)value;
    }
 else     if (value instanceof Number) {
      return Double.valueOf(((Number)value).doubleValue());
    }
 else {
      double doubleValue=Double.parseDouble(value.toString());
      return Double.valueOf(doubleValue);
    }
  }
  return null;
}
  Double __target__(Object value){
  if (value == null) {
    if (value instanceof Double) {
      return (Double)value;
    }
 else     if (value instanceof Number) {
      return Double.valueOf(((Number)value).doubleValue());
    }
 else {
      double doubleValue=Double.parseDouble(value.toString());
      return Double.valueOf(doubleValue);
    }
  }
  return null;
}

}