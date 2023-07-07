import java.util.*;

public class Target {

boolean hasChanged(String oldValue,String newValue){
  boolean result=false;
  if (oldValue == null && newValue == null) {
    result=false;
  }
 else   if (oldValue == null && (newValue != null && newValue.length() == 0)) {
    result=false;
  }
 else   if (oldValue == null && (newValue != null)) {
    result=true;
  }
 else   if (oldValue != null && newValue == null) {
    result=true;
  }
 else   if (!oldValue.equals(newValue)) {
    result=true;
  }
  return result;
}
  boolean __target__(String oldValue,String newValue){
  boolean result=false;
  if (oldValue == null && newValue == null) {
    result=false;
  }
 else   if (oldValue == null && (newValue != null && newValue.length() == 0)) {
    result=false;
  }
 else   if (oldValue == null && (newValue == null)) {
    result=true;
  }
 else   if (oldValue != null && newValue == null) {
    result=true;
  }
 else   if (!oldValue.equals(newValue)) {
    result=true;
  }
  return result;
}

}