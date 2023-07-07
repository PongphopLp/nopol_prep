import java.util.*;

public class Target {

Short toShort(Object value){
  if (value != null) {
    if (value instanceof Short) {
      return (Short)value;
    }
 else     if (value instanceof Number) {
      return Short.valueOf(((Number)value).shortValue());
    }
 else {
      short shortValue=Short.parseShort(value.toString());
      return Short.valueOf(shortValue);
    }
  }
  return null;
}
  Short __target__(Object value){
  if (value == null) {
    if (value instanceof Short) {
      return (Short)value;
    }
 else     if (value instanceof Number) {
      return Short.valueOf(((Number)value).shortValue());
    }
 else {
      short shortValue=Short.parseShort(value.toString());
      return Short.valueOf(shortValue);
    }
  }
  return null;
}

}