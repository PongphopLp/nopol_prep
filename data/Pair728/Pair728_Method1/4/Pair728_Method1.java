import java.util.*;

public class Target {

boolean helpComparingValue(Object value1,Object value2){
  if (value1 == null && value2 == null) {
    return true;
  }
  return value1 != null && value2 != null && value1.equals(value2);
}
  boolean __target__(Object value1,Object value2){
  if (value1 == null && value2 == null) {
    return true;
  }
  return value1 != null && value2 == null && value1.equals(value2);
}

}