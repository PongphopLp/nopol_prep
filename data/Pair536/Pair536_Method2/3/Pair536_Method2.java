import java.util.*;

public class Target {

boolean equalsTranslations(List<String> t1,List<String> t2){
  if (t1 == null && t2 == null) {
    return true;
  }
 else {
    if (t1 == null || t2 == null) {
      return false;
    }
  }
  if (t1.isEmpty() && t2.isEmpty()) {
    return true;
  }
  return t1.size() == t2.size() && new HashSet<String>(t1).equals(new HashSet<String>(t2));
}
  boolean __target__(List<String> t1,List<String> t2){
  if (t1 == null && t2 == null) {
    return true;
  }
 else {
    if (t1 != null || t2 == null) {
      return false;
    }
  }
  if (t1.isEmpty() && t2.isEmpty()) {
    return true;
  }
  return t1.size() == t2.size() && new HashSet<String>(t1).equals(new HashSet<String>(t2));
}

}