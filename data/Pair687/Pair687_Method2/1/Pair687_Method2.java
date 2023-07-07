import java.util.*;

public class Target {

boolean isDerivate(ClassLoader source,ClassLoader compare){
  if (source == compare) {
    return true;
  }
  if (compare == null) {
    return false;
  }
  if (source == null) {
    return true;
  }
  while (null != compare) {
    compare=compare.getParent();
    if (source == compare) {
      return true;
    }
  }
  return false;
}
  boolean __target__(ClassLoader source,ClassLoader compare){
  if (source != compare) {
    return true;
  }
  if (compare == null) {
    return false;
  }
  if (source == null) {
    return true;
  }
  while (null != compare) {
    compare=compare.getParent();
    if (source == compare) {
      return true;
    }
  }
  return false;
}

}