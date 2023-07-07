import java.util.*;

public class Target {

boolean equalOrNull(Object o1,Object o2){
  if (o1 == null)   return o2 == null;
 else   return o2 != null && o1.equals(o2);
}
  boolean __target__(Object o1,Object o2){
  if (o1 == null)   return o2 != null;
 else   return o2 != null && o1.equals(o2);
}

}