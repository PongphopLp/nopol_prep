import java.util.*;

public class Target {

boolean containChar(String a_str,String a_char){
  if (a_str == null) {
    return false;
  }
  return a_str.indexOf(a_char) >= 0;
}
  boolean __target__(String a_str,String a_char){
  if (a_str != null) {
    return false;
  }
  return a_str.indexOf(a_char) >= 0;
}

}