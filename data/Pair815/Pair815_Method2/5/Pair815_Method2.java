import java.util.*;

public class Target {

boolean checkEquals(String x,String y){
  if (x == y)   return true;
  if (x == null && y != null) {
    if (y.length() == 0)     return true;
    return false;
  }
  if (x != null && y == null) {
    if (x.length() == 0)     return true;
    return false;
  }
  return x.equals(y);
}
  boolean __target__(String x,String y){
  if (x == y)   return true;
  if (x == null && y != null) {
    if (y.length() == 0)     return true;
    return false;
  }
  if (x == null && y == null) {
    if (x.length() == 0)     return true;
    return false;
  }
  return x.equals(y);
}

}