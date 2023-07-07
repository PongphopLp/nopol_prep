import java.util.*;

public class Target {

boolean stringsEqual(String oldStr,String newStr){
  if (oldStr == null && newStr != null) {
    return false;
  }
  if (oldStr != null && newStr == null) {
    return false;
  }
  if (oldStr == null && newStr == null) {
    return true;
  }
  if (oldStr.equals(newStr)) {
    return true;
  }
 else {
    return false;
  }
}
  boolean __target__(String oldStr,String newStr){
  if (oldStr == null && newStr != null) {
    return false;
  }
  if (oldStr != null && newStr != null) {
    return false;
  }
  if (oldStr == null && newStr == null) {
    return true;
  }
  if (oldStr.equals(newStr)) {
    return true;
  }
 else {
    return false;
  }
}

}