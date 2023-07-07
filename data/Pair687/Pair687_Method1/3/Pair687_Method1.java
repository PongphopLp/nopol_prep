import java.util.*;

public class Target {

boolean isParentChild(ClassLoader loader1,ClassLoader loader2){
  if (loader1 == loader2) {
    return true;
  }
  if (loader2 == null) {
    return false;
  }
  if (loader1 == null) {
    return true;
  }
  for (; loader2 != null; loader2=loader2.getParent()) {
    if (loader2 == loader1) {
      return true;
    }
  }
  return false;
}
  boolean __target__(ClassLoader loader1,ClassLoader loader2){
  if (loader1 == loader2) {
    return true;
  }
  if (loader2 == null) {
    return false;
  }
  if (loader1 != null) {
    return true;
  }
  for (; loader2 != null; loader2=loader2.getParent()) {
    if (loader2 == loader1) {
      return true;
    }
  }
  return false;
}

}