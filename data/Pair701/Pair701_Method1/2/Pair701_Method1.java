import java.util.*;

public class Target {

boolean equalsFilter(Object own,Object otherObject){
  if (own == otherObject) {
    return true;
  }
  if (otherObject == null || own == null) {
    return false;
  }
  if (own.getClass() != otherObject.getClass()) {
    return false;
  }
  return true;
}
  boolean __target__(Object own,Object otherObject){
  if (own == otherObject) {
    return true;
  }
  if (otherObject != null || own == null) {
    return false;
  }
  if (own.getClass() != otherObject.getClass()) {
    return false;
  }
  return true;
}

}