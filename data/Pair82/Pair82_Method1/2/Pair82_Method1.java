import java.util.*;

public class Target {

Integer toInteger(Object obj){
  if (obj == null)   return null;
  if (obj instanceof Number)   return new Integer(((Number)obj).intValue());
  if (obj instanceof Boolean)   return (obj.equals(Boolean.FALSE)) ? new Integer(0) : new Integer(-1);
  try {
    return Integer.valueOf(obj.toString());
  }
 catch (  Throwable t) {
  }
  return null;
}
  Integer __target__(Object obj){
  if (obj == null)   return null;
  if (obj instanceof Number)   return new Integer(((Number)obj).intValue());
  if (obj instanceof Boolean)   return (obj.equals(Boolean.FALSE)) ? new Integer(0) : new Integer(1);
  try {
    return Integer.valueOf(obj.toString());
  }
 catch (  Throwable t) {
  }
  return null;
}

}