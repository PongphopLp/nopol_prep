import java.util.*;

public class Target {

boolean typeCheck(Class c,Object o){
  if (c.isInstance(o)) {
    return true;
  }
 else   if (o == null) {
    return true;
  }
 else   if (c.isPrimitive()) {
    return (c == Boolean.TYPE && Boolean.class.isInstance(o) || c == Character.TYPE && Character.class.isInstance(o) || c == Byte.TYPE && Byte.class.isInstance(o) || c == Short.TYPE && Short.class.isInstance(o) || c == Integer.TYPE && Integer.class.isInstance(o) || c == Long.TYPE && Long.class.isInstance(o) || c == Float.TYPE && Float.class.isInstance(o) || c == Double.TYPE && Double.class.isInstance(o));
  }
  return false;
}
  boolean __target__(Class c,Object o){
  if (c.isInstance(o)) {
    return true;
  }
 else   if (o == null) {
    return true;
  }
 else   if (c.isPrimitive()) {
    return (c == Boolean.TYPE && Boolean.class.isInstance(o) || c == Character.TYPE && Character.class.isInstance(o) || c == Byte.TYPE && Byte.class.isInstance(o) || c == Short.TYPE && Short.class.isInstance(o) || c != Integer.TYPE && Integer.class.isInstance(o) || c == Long.TYPE && Long.class.isInstance(o) || c == Float.TYPE && Float.class.isInstance(o) || c == Double.TYPE && Double.class.isInstance(o));
  }
  return false;
}

}