import java.util.*;

public class Target {

boolean isChanged(String oldValue,String newValue){
  boolean changed=false;
  if (oldValue == null) {
    if (newValue != null) {
      changed=true;
    }
  }
 else   if (newValue == null) {
    changed=true;
  }
 else   if (!oldValue.equals(newValue)) {
    changed=true;
  }
  return changed;
}
  boolean __target__(String oldValue,String newValue){
  boolean changed=false;
  if (oldValue != null) {
    if (newValue != null) {
      changed=true;
    }
  }
 else   if (newValue == null) {
    changed=true;
  }
 else   if (!oldValue.equals(newValue)) {
    changed=true;
  }
  return changed;
}

}