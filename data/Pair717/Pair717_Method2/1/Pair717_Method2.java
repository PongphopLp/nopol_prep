import java.util.*;

public class Target {

boolean AreEqual(Object o1,Object o2){
  if (o1 == null && o2 == null)   return true;
  if (o1 == null || o2 == null)   return false;
  if (o1.equals(o2))   return true;
 else   return false;
}
  boolean __target__(Object o1,Object o2){
  if (o1 != null && o2 == null)   return true;
  if (o1 == null || o2 == null)   return false;
  if (o1.equals(o2))   return true;
 else   return false;
}

}