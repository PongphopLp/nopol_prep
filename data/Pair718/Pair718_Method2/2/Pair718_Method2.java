import java.util.*;

public class Target {

boolean sameClass(Object left,Object right){
  if (left == right)   return true;
  if (left == null || right == null)   return false;
  return left.getClass() == right.getClass();
}
  boolean __target__(Object left,Object right){
  if (left == right)   return true;
  if (left != null || right == null)   return false;
  return left.getClass() == right.getClass();
}

}