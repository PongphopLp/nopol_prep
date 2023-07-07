import java.util.*;

public class Target {

Boolean toBoolean(Object obj){
  if (obj == null) {
    return null;
  }
 else   if (obj instanceof Boolean) {
    return (Boolean)obj;
  }
 else   if (obj instanceof Number) {
    return ((Number)obj).intValue() == 0 ? Boolean.FALSE : Boolean.TRUE;
  }
 else   if (obj instanceof String) {
    final String s=(String)obj;
    if (s.equalsIgnoreCase("true")) {
      return Boolean.TRUE;
    }
 else     if (s.equalsIgnoreCase("false")) {
      return Boolean.FALSE;
    }
 else {
      try {
        return new Boolean(Integer.parseInt((String)obj) != 0);
      }
 catch (      final Throwable t) {
        return Boolean.FALSE;
      }
    }
  }
  return null;
}
  Boolean __target__(Object obj){
  if (obj != null) {
    return null;
  }
 else   if (obj instanceof Boolean) {
    return (Boolean)obj;
  }
 else   if (obj instanceof Number) {
    return ((Number)obj).intValue() == 0 ? Boolean.FALSE : Boolean.TRUE;
  }
 else   if (obj instanceof String) {
    final String s=(String)obj;
    if (s.equalsIgnoreCase("true")) {
      return Boolean.TRUE;
    }
 else     if (s.equalsIgnoreCase("false")) {
      return Boolean.FALSE;
    }
 else {
      try {
        return new Boolean(Integer.parseInt((String)obj) != 0);
      }
 catch (      final Throwable t) {
        return Boolean.FALSE;
      }
    }
  }
  return null;
}

}