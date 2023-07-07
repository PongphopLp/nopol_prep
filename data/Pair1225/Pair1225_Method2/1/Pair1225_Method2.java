import java.util.*;

public class Target {

boolean contains(String[] array,String string,boolean ignore_case){
  if (array == null)   return false;
  for (  String element : array) {
    if (ignore_case ? string.equalsIgnoreCase(element) : string.equals(element)) {
      return true;
    }
  }
  return false;
}
  boolean __target__(String[] array,String string,boolean ignore_case){
  if (array != null)   return false;
  for (  String element : array) {
    if (ignore_case ? string.equalsIgnoreCase(element) : string.equals(element)) {
      return true;
    }
  }
  return false;
}

}