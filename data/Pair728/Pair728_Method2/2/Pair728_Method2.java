import java.util.*;

public class Target {

boolean objetosIguales(Object obj1,Object obj2){
  if ((obj1 != null) || (obj2 != null))   if ((obj1 != null) && (obj2 != null)) {
    if (!obj1.equals(obj2))     return false;
  }
 else   if ((obj1 != null) || (obj2 != null))   return false;
  return true;
}
  boolean __target__(Object obj1,Object obj2){
  if ((obj1 != null) || (obj2 == null))   if ((obj1 != null) && (obj2 != null)) {
    if (!obj1.equals(obj2))     return false;
  }
 else   if ((obj1 != null) || (obj2 != null))   return false;
  return true;
}

}