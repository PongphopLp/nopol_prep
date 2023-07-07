import java.util.*;

public class Target {

Long toLong(Object value){
  if (value != null) {
    if (value instanceof Long) {
      return (Long)value;
    }
 else     if (value instanceof Number) {
      return Long.valueOf(((Number)value).longValue());
    }
 else {
      long longValue=Long.parseLong(value.toString());
      return Long.valueOf(longValue);
    }
  }
  return null;
}
  Long __target__(Object value){
  if (value == null) {
    if (value instanceof Long) {
      return (Long)value;
    }
 else     if (value instanceof Number) {
      return Long.valueOf(((Number)value).longValue());
    }
 else {
      long longValue=Long.parseLong(value.toString());
      return Long.valueOf(longValue);
    }
  }
  return null;
}

}