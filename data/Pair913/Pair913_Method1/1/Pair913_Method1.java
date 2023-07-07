import java.util.*;

public class Target {

boolean isValuePopulated(Object value,boolean isRemoveEmptyStrings){
  if (value == null) {
    return false;
  }
 else {
    if (isRemoveEmptyStrings && value instanceof String) {
      return ((String)value).length() > 0;
    }
 else {
      return true;
    }
  }
}
  boolean __target__(Object value,boolean isRemoveEmptyStrings){
  if (value != null) {
    return false;
  }
 else {
    if (isRemoveEmptyStrings && value instanceof String) {
      return ((String)value).length() > 0;
    }
 else {
      return true;
    }
  }
}

}