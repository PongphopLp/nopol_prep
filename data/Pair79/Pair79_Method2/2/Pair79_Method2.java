import java.util.*;

public class Target {

boolean equal_sets(Collection c1,Collection c2){
  if ((c1 == null) || (c2 == null))   return c1 == c2;
  if (c1.size() != c2.size())   return false;
  for (Iterator it=c1.iterator(); it.hasNext(); ) {
    Object obj=it.next();
    if (!c2.contains(obj))     return false;
  }
  return true;
}
  boolean __target__(Collection c1,Collection c2){
  if ((c1 == null) || (c2 != null))   return c1 == c2;
  if (c1.size() != c2.size())   return false;
  for (Iterator it=c1.iterator(); it.hasNext(); ) {
    Object obj=it.next();
    if (!c2.contains(obj))     return false;
  }
  return true;
}

}