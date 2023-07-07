import java.util.*;

public class Target {

Short toShort(Object obj){
  if (obj == null) {
    return null;
  }
 else   if (obj instanceof Number) {
    return new Short(((Number)obj).shortValue());
  }
 else   if (obj instanceof Boolean) {
    return obj.equals(Boolean.FALSE) ? new Short((short)0) : new Short((short)-1);
  }
 else {
    try {
      return Short.valueOf(obj.toString());
    }
 catch (    final Throwable t) {
    }
  }
  return null;
}
  Short __target__(Object obj){
  if (obj != null) {
    return null;
  }
 else   if (obj instanceof Number) {
    return new Short(((Number)obj).shortValue());
  }
 else   if (obj instanceof Boolean) {
    return obj.equals(Boolean.FALSE) ? new Short((short)0) : new Short((short)-1);
  }
 else {
    try {
      return Short.valueOf(obj.toString());
    }
 catch (    final Throwable t) {
    }
  }
  return null;
}

}