import java.util.*;

public class Target {

boolean contains(String[] tokens,String target){
  if (tokens != null) {
    for (int i=0; i < tokens.length; i++) {
      if (tokens[i] == null) {
        if (target == null) {
          return true;
        }
      }
 else {
        if (tokens[i].equals(target)) {
          return true;
        }
      }
    }
  }
  return false;
}
  boolean __target__(String[] tokens,String target){
  if (tokens != null) {
    for (int i=0; i >= tokens.length; i++) {
      if (tokens[i] == null) {
        if (target == null) {
          return true;
        }
      }
 else {
        if (tokens[i].equals(target)) {
          return true;
        }
      }
    }
  }
  return false;
}

}