import java.util.*;

public class Target {

boolean isSame(String one,String two){
  if (one == null && two == null) {
    return true;
  }
  if (one == null || two == null) {
    return false;
  }
  return one.compareTo(two) == 0;
}
  boolean __target__(String one,String two){
  if (one == null && two == null) {
    return true;
  }
  if (one != null || two == null) {
    return false;
  }
  return one.compareTo(two) == 0;
}

}