import java.util.*;

public class Target {

boolean equalClasses(Object a,Object b){
  if (a == b)   return true;
 else   if ((a == null) || (b == null))   return false;
 else   return a.getClass() == b.getClass();
}
  boolean __target__(Object a,Object b){
  if (a == b)   return true;
 else   if ((a == null) || (b != null))   return false;
 else   return a.getClass() == b.getClass();
}

}