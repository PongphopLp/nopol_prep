import java.util.*;

public class Target {

boolean isCompatible(Object lhs,Object rhs){
  if (lhs == rhs) {
    return true;
  }
  if (lhs == null || rhs == null) {
    return false;
  }
  if (!lhs.getClass().equals(rhs.getClass())) {
    return false;
  }
  return true;
}
  boolean __target__(Object lhs,Object rhs){
  if (lhs != rhs) {
    return true;
  }
  if (lhs == null || rhs == null) {
    return false;
  }
  if (!lhs.getClass().equals(rhs.getClass())) {
    return false;
  }
  return true;
}

}