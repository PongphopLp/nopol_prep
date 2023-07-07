import java.util.*;

public class Target {

Byte toByte(Object obj){
  if (obj == null) {
    return null;
  }
 else   if (obj instanceof Number) {
    return new Byte(((Number)obj).byteValue());
  }
 else   if (obj instanceof Boolean) {
    return obj.equals(Boolean.FALSE) ? Byte.valueOf((byte)0) : new Byte((byte)-1);
  }
 else {
    try {
      return Byte.valueOf(obj.toString());
    }
 catch (    final Throwable t) {
    }
  }
  return null;
}
  Byte __target__(Object obj){
  if (obj != null) {
    return null;
  }
 else   if (obj instanceof Number) {
    return new Byte(((Number)obj).byteValue());
  }
 else   if (obj instanceof Boolean) {
    return obj.equals(Boolean.FALSE) ? Byte.valueOf((byte)0) : new Byte((byte)-1);
  }
 else {
    try {
      return Byte.valueOf(obj.toString());
    }
 catch (    final Throwable t) {
    }
  }
  return null;
}

}