import java.util.*;

public class Target {

boolean equalsValues(Object obj1,Object obj2){
  if (obj1 == obj2) {
    return true;
  }
  if ((obj1 == null && obj2 != null) || (obj2 == null && obj1 != null) || (obj1.getClass() != obj2.getClass())) {
    return false;
  }
  return obj1.equals(obj2);
}
  boolean __target__(Object obj1,Object obj2){
  if (obj1 == obj2) {
    return true;
  }
  if ((obj1 == null && obj2 == null) || (obj2 == null && obj1 != null) || (obj1.getClass() != obj2.getClass())) {
    return false;
  }
  return obj1.equals(obj2);
}

}