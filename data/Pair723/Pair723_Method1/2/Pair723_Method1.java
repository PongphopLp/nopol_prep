import java.util.*;

public class Target {

boolean evaluate(Object left,Object right){
  if (left == null || right == null)   return false;
 else {
    if (left instanceof Number && right instanceof Number) {
      Number leftNumber=(Number)left;
      Number rightNumber=(Number)right;
      return leftNumber.doubleValue() > rightNumber.doubleValue();
    }
 else     return false;
  }
}
  boolean __target__(Object left,Object right){
  if (left != null || right == null)   return false;
 else {
    if (left instanceof Number && right instanceof Number) {
      Number leftNumber=(Number)left;
      Number rightNumber=(Number)right;
      return leftNumber.doubleValue() > rightNumber.doubleValue();
    }
 else     return false;
  }
}

}