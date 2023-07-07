import java.util.*;

public class Target {

boolean hasStringChanged(String oldString,String newString){
  if (oldString == null && newString == null) {
    return false;
  }
 else   if (oldString == null || newString == null) {
    return true;
  }
 else {
    return !oldString.equals(newString);
  }
}
  boolean __target__(String oldString,String newString){
  if (oldString != null && newString == null) {
    return false;
  }
 else   if (oldString == null || newString == null) {
    return true;
  }
 else {
    return !oldString.equals(newString);
  }
}

}