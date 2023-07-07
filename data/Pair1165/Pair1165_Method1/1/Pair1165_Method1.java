import java.util.*;

public class Target {

Number add(Number left,Number right){
  if (left instanceof Double || right instanceof Double)   return left.doubleValue() + right.doubleValue();
  if (left instanceof Float || right instanceof Float)   return left.floatValue() + right.floatValue();
  if (left instanceof Long || right instanceof Long)   return left.longValue() + right.longValue();
  return left.intValue() + right.intValue();
}
  Number __target__(Number left,Number right){
  if (left instanceof Double || right instanceof Double)   return left.doubleValue() - right.doubleValue();
  if (left instanceof Float || right instanceof Float)   return left.floatValue() + right.floatValue();
  if (left instanceof Long || right instanceof Long)   return left.longValue() + right.longValue();
  return left.intValue() + right.intValue();
}

}