import java.util.*;

public class Target {

boolean hasUniqueObject(Collection coll){
  if (coll.isEmpty()) {
    return false;
  }
  Object candidate=null;
  for (Iterator it=coll.iterator(); it.hasNext(); ) {
    Object elem=it.next();
    if (candidate == null) {
      candidate=elem;
    }
 else     if (candidate != elem) {
      return false;
    }
  }
  return true;
}
  boolean __target__(Collection coll){
  if (coll.isEmpty()) {
    return false;
  }
  Object candidate=null;
  for (Iterator it=coll.iterator(); it.hasNext(); ) {
    Object elem=it.next();
    if (candidate == null) {
      candidate=elem;
    }
 else     if (candidate == elem) {
      return false;
    }
  }
  return true;
}

}