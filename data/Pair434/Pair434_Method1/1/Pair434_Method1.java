import java.util.*;

public class Target {

boolean areEqualComparables(Comparable object1,Comparable object2){
  if (object1 == null) {
    return (object2 == null);
  }
 else   if (object2 == null) {
    return false;
  }
  return (object1.compareTo(object2) == 0);
}
  boolean __target__(Comparable object1,Comparable object2){
  if (object1 != null) {
    return (object2 == null);
  }
 else   if (object2 == null) {
    return false;
  }
  return (object1.compareTo(object2) == 0);
}

}