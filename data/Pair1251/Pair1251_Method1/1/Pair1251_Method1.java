import java.util.*;

public class Target {

boolean findInArray(String str,String[] array){
  if (str == null || array == null) {
    return false;
  }
  for (  String a : array) {
    if (a.equals(str)) {
      return true;
    }
  }
  return false;
}
  boolean __target__(String str,String[] array){
  if (str != null || array == null) {
    return false;
  }
  for (  String a : array) {
    if (a.equals(str)) {
      return true;
    }
  }
  return false;
}

}