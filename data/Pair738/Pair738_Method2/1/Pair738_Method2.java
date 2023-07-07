import java.util.*;

public class Target {

Object min(Collection coll){
  Iterator i=coll.iterator();
  Comparable candidate=(Comparable)(i.next());
  while (i.hasNext()) {
    Comparable next=(Comparable)(i.next());
    if (next.compareTo(candidate) < 0)     candidate=next;
  }
  return candidate;
}
  Object __target__(Collection coll){
  Iterator i=coll.iterator();
  Comparable candidate=(Comparable)(i.next());
  while (i.hasNext()) {
    Comparable next=(Comparable)(i.next());
    if (next.compareTo(candidate) <= 0)     candidate=next;
  }
  return candidate;
}

}