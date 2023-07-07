import java.util.*;

public class Target {

Byte toByte(Object obj){
  if (obj == null) {
    return null;
  }
  if (obj instanceof Number) {
    return new Byte(((Number)obj).byteValue());
  }
  if (obj instanceof Boolean) {
    return obj.equals(Boolean.FALSE) ? new Byte((byte)0) : new Byte((byte)-1);
  }
  try {
    return Byte.valueOf(obj.toString());
  }
 catch (  final Throwable t) {
  }
  return null;
}
  Byte __target__(Object obj){
  if (obj != null) {
    return null;
  }
  if (obj instanceof Number) {
    return new Byte(((Number)obj).byteValue());
  }
  if (obj instanceof Boolean) {
    return obj.equals(Boolean.FALSE) ? new Byte((byte)0) : new Byte((byte)-1);
  }
  try {
    return Byte.valueOf(obj.toString());
  }
 catch (  final Throwable t) {
  }
  return null;
}

}