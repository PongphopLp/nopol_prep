import java.util.*;

public class Target {

boolean stringInArr(String str,String[] strArr){
  boolean found=false;
  if (str != null && !str.equals("")) {
    for (    String element : strArr) {
      if (str.equalsIgnoreCase(element)) {
        found=true;
        break;
      }
    }
  }
  return found;
}
  boolean __target__(String str,String[] strArr){
  boolean found=false;
  if (str == null && !str.equals("")) {
    for (    String element : strArr) {
      if (str.equalsIgnoreCase(element)) {
        found=true;
        break;
      }
    }
  }
  return found;
}

}