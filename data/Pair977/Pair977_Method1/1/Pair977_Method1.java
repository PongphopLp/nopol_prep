import java.util.*;

public class Target {

Short toShort(Object value){
  if (value == null) {
    return null;
  }
  if (value instanceof Short) {
    return (Short)value;
  }
  if (value instanceof Number) {
    return Short.valueOf(((Number)value).shortValue());
  }
  return Short.valueOf(value.toString());
}
  Short __target__(Object value){
  if (value != null) {
    return null;
  }
  if (value instanceof Short) {
    return (Short)value;
  }
  if (value instanceof Number) {
    return Short.valueOf(((Number)value).shortValue());
  }
  return Short.valueOf(value.toString());
}

}