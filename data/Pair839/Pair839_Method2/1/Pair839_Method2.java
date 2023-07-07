import java.util.*;

public class Target {

Boolean toBoolean(Object obj){
  if (obj == null)   return null;
  if (obj instanceof Boolean) {
    return (Boolean)obj;
  }
 else   if (obj instanceof Number) {
    return (((Number)obj).intValue() == 0) ? Boolean.FALSE : Boolean.TRUE;
  }
 else   if (obj instanceof String) {
    String s=((String)obj).toLowerCase();
    if (s.startsWith("t")) {
      return Boolean.TRUE;
    }
 else     if (s.startsWith("f")) {
      return Boolean.FALSE;
    }
 else     if (s.startsWith("y")) {
      return Boolean.TRUE;
    }
 else     if (s.startsWith("n")) {
      return Boolean.FALSE;
    }
 else {
      try {
        return new Boolean(Integer.parseInt((String)obj) != 0);
      }
 catch (      Throwable t) {
        return Boolean.FALSE;
      }
    }
  }
  return null;
}
  Boolean __target__(Object obj){
  if (obj != null)   return null;
  if (obj instanceof Boolean) {
    return (Boolean)obj;
  }
 else   if (obj instanceof Number) {
    return (((Number)obj).intValue() == 0) ? Boolean.FALSE : Boolean.TRUE;
  }
 else   if (obj instanceof String) {
    String s=((String)obj).toLowerCase();
    if (s.startsWith("t")) {
      return Boolean.TRUE;
    }
 else     if (s.startsWith("f")) {
      return Boolean.FALSE;
    }
 else     if (s.startsWith("y")) {
      return Boolean.TRUE;
    }
 else     if (s.startsWith("n")) {
      return Boolean.FALSE;
    }
 else {
      try {
        return new Boolean(Integer.parseInt((String)obj) != 0);
      }
 catch (      Throwable t) {
        return Boolean.FALSE;
      }
    }
  }
  return null;
}

}