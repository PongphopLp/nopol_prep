import java.util.*;

public class Target {

boolean isValueChanged(Object old_value,Object new_value){
  if (old_value == null) {
    if (new_value == null) {
      return false;
    }
 else {
      return true;
    }
  }
 else {
    if (new_value == null) {
      return true;
    }
 else {
      return !old_value.equals(new_value);
    }
  }
}
  boolean __target__(Object old_value,Object new_value){
  if (old_value != null) {
    if (new_value == null) {
      return false;
    }
 else {
      return true;
    }
  }
 else {
    if (new_value == null) {
      return true;
    }
 else {
      return !old_value.equals(new_value);
    }
  }
}

}