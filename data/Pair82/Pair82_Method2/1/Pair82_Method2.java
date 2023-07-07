import java.util.*;

public class Target {

Integer toInt(Object obj){
  if (obj == null) {
    return null;
  }
 else   if (obj instanceof Number) {
    return new Integer(((Number)obj).intValue());
  }
 else   if (obj instanceof Boolean) {
    return obj.equals(Boolean.FALSE) ? new Integer(0) : new Integer(-1);
  }
 else {
    try {
      return Integer.valueOf(obj.toString());
    }
 catch (    final Throwable t) {
    }
  }
  return null;
}
  Integer __target__(Object obj){
  if (obj != null) {
    return null;
  }
 else   if (obj instanceof Number) {
    return new Integer(((Number)obj).intValue());
  }
 else   if (obj instanceof Boolean) {
    return obj.equals(Boolean.FALSE) ? new Integer(0) : new Integer(-1);
  }
 else {
    try {
      return Integer.valueOf(obj.toString());
    }
 catch (    final Throwable t) {
    }
  }
  return null;
}

}