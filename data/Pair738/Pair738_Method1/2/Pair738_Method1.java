import java.util.*;

public class Target {

Object min(Collection c){
  Iterator i=c.iterator();
  Comparable min=(Comparable)i.next();
  while (i.hasNext()) {
    Object o=i.next();
    if (min.compareTo(o) > 0) {
      min=(Comparable)o;
    }
  }
  return min;
}
  Object __target__(Collection c){
  Iterator i=c.iterator();
  Comparable min=(Comparable)i.next();
  while (i.hasNext()) {
    Object o=i.next();
    if (min.compareTo(o) <= 0) {
      min=(Comparable)o;
    }
  }
  return min;
}

}