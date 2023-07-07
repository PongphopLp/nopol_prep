import java.util.*;

public class Target {

boolean isIgnored(Object value,Object[] ignoredValue){
  if (ignoredValue == null || ignoredValue.length == 0) {
    return false;
  }
  for (int i=0; i < ignoredValue.length; i++) {
    if (ignoredValue[i] == null) {
      if (value == null) {
        return true;
      }
    }
 else {
      if (ignoredValue[i].equals(value)) {
        return true;
      }
    }
  }
  return false;
}
  boolean __target__(Object value,Object[] ignoredValue){
  if (ignoredValue != null || ignoredValue.length == 0) {
    return false;
  }
  for (int i=0; i < ignoredValue.length; i++) {
    if (ignoredValue[i] == null) {
      if (value == null) {
        return true;
      }
    }
 else {
      if (ignoredValue[i].equals(value)) {
        return true;
      }
    }
  }
  return false;
}

}