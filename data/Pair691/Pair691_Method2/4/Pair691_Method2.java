import java.util.*;

public class Target {

boolean valuesEqual(Object value1,Object value2){
  if (value1 == value2)   return true;
 else   if (value1 == null || value2 == null)   return false;
 else   if (value1.getClass() == value2.getClass())   return value1.equals(value2);
 else   return false;
}
  boolean __target__(Object value1,Object value2){
  if (value1 == value2)   return true;
 else   if (value1 == null || value2 == null)   return false;
 else   if (value1.getClass() != value2.getClass())   return value1.equals(value2);
 else   return false;
}

}