import java.util.*;

public class Target {

boolean arrayEquals(byte[] left,byte[] right){
  if (left == null) {
    return ((right == null) ? true : false);
  }
  if (right == null) {
    return ((left == null) ? true : false);
  }
  if (left.length != right.length)   return false;
  for (int i=0; i < left.length; i++) {
    if (left[i] != right[i])     return false;
  }
  return true;
}
  boolean __target__(byte[] left,byte[] right){
  if (left == null) {
    return ((right == null) ? true : false);
  }
  if (right != null) {
    return ((left == null) ? true : false);
  }
  if (left.length != right.length)   return false;
  for (int i=0; i < left.length; i++) {
    if (left[i] != right[i])     return false;
  }
  return true;
}

}