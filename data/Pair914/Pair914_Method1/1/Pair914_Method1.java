import java.util.*;

public class Target {

boolean toSafeBoolean(Object obj,boolean defaultValue){
  if (obj == null)   return defaultValue;
  if (obj instanceof Boolean) {
    return ((Boolean)obj).booleanValue();
  }
 else   if (obj instanceof Number) {
    return (((Number)obj).intValue() == 0) ? false : true;
  }
 else   if (obj instanceof String) {
    String s=(String)obj;
    if (s.equalsIgnoreCase("true")) {
      return true;
    }
 else     if (s.equalsIgnoreCase("false")) {
      return false;
    }
 else {
      try {
        return Integer.parseInt((String)obj) != 0;
      }
 catch (      Throwable t) {
        return false;
      }
    }
  }
  return defaultValue;
}
  boolean __target__(Object obj,boolean defaultValue){
  if (obj != null)   return defaultValue;
  if (obj instanceof Boolean) {
    return ((Boolean)obj).booleanValue();
  }
 else   if (obj instanceof Number) {
    return (((Number)obj).intValue() == 0) ? false : true;
  }
 else   if (obj instanceof String) {
    String s=(String)obj;
    if (s.equalsIgnoreCase("true")) {
      return true;
    }
 else     if (s.equalsIgnoreCase("false")) {
      return false;
    }
 else {
      try {
        return Integer.parseInt((String)obj) != 0;
      }
 catch (      Throwable t) {
        return false;
      }
    }
  }
  return defaultValue;
}

}