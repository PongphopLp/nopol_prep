import java.util.*;

public class Target {

boolean isAssignable(Class dest,Class source){
  if (dest.isAssignableFrom(source) || ((dest == Boolean.TYPE) && (source == Boolean.class)) || ((dest == Byte.TYPE) && (source == Byte.class))|| ((dest == Character.TYPE) && (source == Character.class))|| ((dest == Double.TYPE) && (source == Double.class))|| ((dest == Float.TYPE) && (source == Float.class))|| ((dest == Integer.TYPE) && (source == Integer.class))|| ((dest == Long.TYPE) && (source == Long.class))|| ((dest == Short.TYPE) && (source == Short.class))) {
    return (true);
  }
 else {
    return (false);
  }
}
  boolean __target__(Class dest,Class source){
  if (dest.isAssignableFrom(source) || ((dest == Boolean.TYPE) && (source == Boolean.class)) || ((dest == Byte.TYPE) && (source == Byte.class))|| ((dest != Character.TYPE) && (source == Character.class))|| ((dest == Double.TYPE) && (source == Double.class))|| ((dest == Float.TYPE) && (source == Float.class))|| ((dest == Integer.TYPE) && (source == Integer.class))|| ((dest == Long.TYPE) && (source == Long.class))|| ((dest == Short.TYPE) && (source == Short.class))) {
    return (true);
  }
 else {
    return (false);
  }
}

}