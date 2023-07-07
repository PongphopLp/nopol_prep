import java.util.*;

public class Target {

boolean isAssignable(Class type,Object value){
  if (value == null || type.isInstance(value)) {
    return true;
  }
 else   if (type.isPrimitive()) {
    if (value instanceof Boolean && Boolean.TYPE.equals(type)) {
      return true;
    }
    if (value instanceof Byte && Byte.TYPE.equals(type)) {
      return true;
    }
    if (value instanceof Short && Short.TYPE.equals(type)) {
      return true;
    }
    if (value instanceof Integer && Integer.TYPE.equals(type)) {
      return true;
    }
    if (value instanceof Long && Long.TYPE.equals(type)) {
      return true;
    }
    if (value instanceof Float && Float.TYPE.equals(type)) {
      return true;
    }
    if (value instanceof Double && Double.TYPE.equals(type)) {
      return true;
    }
    if (value instanceof Character && Character.TYPE.equals(type)) {
      return true;
    }
    return false;
  }
 else {
    return false;
  }
}
  boolean __target__(Class type,Object value){
  if (value != null || type.isInstance(value)) {
    return true;
  }
 else   if (type.isPrimitive()) {
    if (value instanceof Boolean && Boolean.TYPE.equals(type)) {
      return true;
    }
    if (value instanceof Byte && Byte.TYPE.equals(type)) {
      return true;
    }
    if (value instanceof Short && Short.TYPE.equals(type)) {
      return true;
    }
    if (value instanceof Integer && Integer.TYPE.equals(type)) {
      return true;
    }
    if (value instanceof Long && Long.TYPE.equals(type)) {
      return true;
    }
    if (value instanceof Float && Float.TYPE.equals(type)) {
      return true;
    }
    if (value instanceof Double && Double.TYPE.equals(type)) {
      return true;
    }
    if (value instanceof Character && Character.TYPE.equals(type)) {
      return true;
    }
    return false;
  }
 else {
    return false;
  }
}

}