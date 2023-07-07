import java.util.*;

public class Target {

boolean notEquals(Integer a,Integer b){
  if (a == null && b == null) {
    return false;
  }
  if (a == null && b != null) {
    return true;
  }
  if (a != null && b == null) {
    return true;
  }
  return a.intValue() != b.intValue();
}
  boolean __target__(Integer a,Integer b){
  if (a == null && b == null) {
    return false;
  }
  if (a == null && b != null) {
    return true;
  }
  if (a != null && b == null) {
    return true;
  }
  return a.intValue() == b.intValue();
}

}