import java.util.*;

public class Target {

boolean sameStringValue(String stringA,String stringB){
  if (stringA == null) {
    if (stringB == null) {
      return true;
    }
 else {
      return false;
    }
  }
  if (stringB == null)   return false;
  if (stringA.compareTo(stringB) == 0) {
    return true;
  }
 else {
    return false;
  }
}
  boolean __target__(String stringA,String stringB){
  if (stringA != null) {
    if (stringB == null) {
      return true;
    }
 else {
      return false;
    }
  }
  if (stringB == null)   return false;
  if (stringA.compareTo(stringB) == 0) {
    return true;
  }
 else {
    return false;
  }
}

}