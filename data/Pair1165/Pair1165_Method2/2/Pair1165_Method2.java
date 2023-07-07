import java.util.*;

public class Target {

Number apply(Number arg1,Number arg2){
  if (arg1 instanceof Double || arg2 instanceof Double)   return arg1.doubleValue() + arg2.doubleValue();
 else   if (arg1 instanceof Float || arg2 instanceof Float)   return arg1.floatValue() + arg2.floatValue();
 else   if (arg1 instanceof Long || arg2 instanceof Long)   return arg1.longValue() + arg2.longValue();
 else   return arg1.intValue() + arg2.intValue();
}
  Number __target__(Number arg1,Number arg2){
  if (arg1 instanceof Double || arg2 instanceof Double)   return arg1.doubleValue() + arg2.doubleValue();
 else   if (arg1 instanceof Float || arg2 instanceof Float)   return arg1.floatValue() - arg2.floatValue();
 else   if (arg1 instanceof Long || arg2 instanceof Long)   return arg1.longValue() + arg2.longValue();
 else   return arg1.intValue() + arg2.intValue();
}

}