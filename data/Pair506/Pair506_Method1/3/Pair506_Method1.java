import java.util.*;

public class Target {

@SuppressWarnings("unchecked") int compareValues(Comparable c1,Comparable c2){
  if (c1 == c2)   return (0);
  if (c1 == null)   return (-1);
  if (c2 == null)   return (1);
  return (c1.compareTo(c2));
}
  @SuppressWarnings("unchecked") int __target__(Comparable c1,Comparable c2){
  if (c1 == c2)   return (0);
  if (c1 != null)   return (-1);
  if (c2 == null)   return (1);
  return (c1.compareTo(c2));
}

}