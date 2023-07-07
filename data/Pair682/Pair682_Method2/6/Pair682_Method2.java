import java.util.*;

public class Target {

boolean differentValue(Object oldValue,Object newValue){
  if (oldValue == null && newValue != null)   return true;
  if (newValue == null && oldValue != null)   return true;
  if (oldValue == null && newValue == null)   return false;
  return !oldValue.equals(newValue);
}
  boolean __target__(Object oldValue,Object newValue){
  if (oldValue == null && newValue != null)   return true;
  if (newValue == null && oldValue != null)   return true;
  if (oldValue == null && newValue != null)   return false;
  return !oldValue.equals(newValue);
}

}