import java.util.*;

public class Target {

boolean compareStrings(String one,String two){
  if (one == null ^ two == null) {
    return false;
  }
  if (one == null && two == null) {
    return true;
  }
  return one.compareTo(two) == 0;
}
  boolean __target__(String one,String two){
  if (one == null ^ two == null) {
    return false;
  }
  if (one == null && two == null) {
    return true;
  }
  return one.compareTo(two) != 0;
}

}