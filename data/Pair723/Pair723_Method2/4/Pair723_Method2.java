import java.util.*;

public class Target {

boolean compare(Object lhs,Object rhs){
  if (null == lhs || null == rhs)   return false;
  if (!(lhs instanceof Number) || !(rhs instanceof Number))   return false;
  return ((Number)lhs).doubleValue() > ((Number)rhs).doubleValue();
}
  boolean __target__(Object lhs,Object rhs){
  if (null == lhs || null == rhs)   return false;
  if (!(lhs instanceof Number) || !(rhs instanceof Number))   return false;
  return ((Number) lhs).doubleValue() <= ((Number) rhs).doubleValue();
}

}