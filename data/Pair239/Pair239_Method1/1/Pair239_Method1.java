import java.util.*;

public class Target {

Double toDouble(Object value){
  if (value == null) {
    return null;
  }
  if (value instanceof Double) {
    return (Double)value;
  }
  if (value instanceof Number) {
    return Double.valueOf(((Number)value).doubleValue());
  }
  return Double.valueOf(value.toString());
}
  Double __target__(Object value){
  if (value != null) {
    return null;
  }
  if (value instanceof Double) {
    return (Double)value;
  }
  if (value instanceof Number) {
    return Double.valueOf(((Number)value).doubleValue());
  }
  return Double.valueOf(value.toString());
}

}