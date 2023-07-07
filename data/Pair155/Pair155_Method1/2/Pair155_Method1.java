import java.util.*;

public class Target {

int compare(Object o1,Object o2){
  if (o1 == null && o2 == null)   return 0;
 else   if (o1 == null)   return -1;
 else   if (o2 == null)   return 1;
  if (o1 instanceof Boolean) {
    boolean b1=((Boolean)o1).booleanValue();
    boolean b2=((Boolean)o2).booleanValue();
    if (b1 && !b2)     return 1;
    if (!b1 && b2)     return -1;
    return 0;
  }
 else   if (o1 instanceof Comparable)   return ((Comparable)o1).compareTo(o2);
  return 0;
}
  int __target__(Object o1,Object o2){
  if (o1 == null && o2 != null)   return 0;
 else   if (o1 == null)   return -1;
 else   if (o2 == null)   return 1;
  if (o1 instanceof Boolean) {
    boolean b1=((Boolean)o1).booleanValue();
    boolean b2=((Boolean)o2).booleanValue();
    if (b1 && !b2)     return 1;
    if (!b1 && b2)     return -1;
    return 0;
  }
 else   if (o1 instanceof Comparable)   return ((Comparable)o1).compareTo(o2);
  return 0;
}

}