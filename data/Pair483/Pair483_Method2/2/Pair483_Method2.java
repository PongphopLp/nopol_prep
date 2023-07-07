import java.util.*;

public class Target {

boolean safeStringCompare(String str1,String str2,boolean ignoreCase){
  if (str1 == null) {
    return (str2 == null);
  }
  if (str2 == null) {
    return false;
  }
  if (ignoreCase) {
    return str1.equalsIgnoreCase(str2);
  }
 else {
    return str1.equals(str2);
  }
}
  boolean __target__(String str1,String str2,boolean ignoreCase){
  if (str1 == null) {
    return (str2 != null);
  }
  if (str2 == null) {
    return false;
  }
  if (ignoreCase) {
    return str1.equalsIgnoreCase(str2);
  }
 else {
    return str1.equals(str2);
  }
}

}