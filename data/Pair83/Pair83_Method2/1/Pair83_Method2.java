import java.util.*;

public class Target {

Integer toInteger(Object value){
  if (value != null) {
    if (value instanceof Integer) {
      return (Integer)value;
    }
 else     if (value instanceof Number) {
      return ((Number)value).intValue();
    }
 else {
      int intValue=Integer.parseInt(value.toString());
      return intValue;
    }
  }
  return null;
}
  Integer __target__(Object value){
  if (value == null) {
    if (value instanceof Integer) {
      return (Integer)value;
    }
 else     if (value instanceof Number) {
      return ((Number)value).intValue();
    }
 else {
      int intValue=Integer.parseInt(value.toString());
      return intValue;
    }
  }
  return null;
}

}