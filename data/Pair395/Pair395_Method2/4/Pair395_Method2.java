import java.util.*;

public class Target {

boolean nullSafeEquals(Object a,Object b,boolean nullsAreEqual){
  if (nullsAreEqual) {
    return (((a == null) && (b == null)) || ((a != null) && (a.equals(b))));
  }
 else {
    return ((a != null) && (b != null) && (a.equals(b)));
  }
}
  boolean __target__(Object a,Object b,boolean nullsAreEqual){
  if (nullsAreEqual) {
    return (((a == null) && (b == null)) || ((a != null) && (a.equals(b))));
  }
 else {
    return ((a == null) && (b != null) && (a.equals(b)));
  }
}

}