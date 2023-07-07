import java.util.*;

public class Target {

Float toFloat(Object value){
  if (value != null) {
    if (value instanceof Float) {
      return (Float)value;
    }
 else     if (value instanceof Number) {
      return Float.valueOf(((Number)value).floatValue());
    }
 else {
      float floatValue=Float.parseFloat(value.toString());
      return Float.valueOf(floatValue);
    }
  }
  return null;
}
  Float __target__(Object value){
  if (value == null) {
    if (value instanceof Float) {
      return (Float)value;
    }
 else     if (value instanceof Number) {
      return Float.valueOf(((Number)value).floatValue());
    }
 else {
      float floatValue=Float.parseFloat(value.toString());
      return Float.valueOf(floatValue);
    }
  }
  return null;
}

}