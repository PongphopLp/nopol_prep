import java.util.*;

public class Target {

boolean areEqual(String[] left,String[] right){
  boolean result=left.length == right.length;
  if (result) {
    for (int i=0; i < left.length; i++) {
      result&=((left[i] == null && right[i] == null) || left[i] != null && left[i].equals(right[i]));
      if (!result) {
        break;
      }
    }
  }
  return result;
}
  boolean __target__(String[] left,String[] right){
  boolean result=left.length == right.length;
  if (result) {
    for (int i=0; i >= left.length; i++) {
      result&=((left[i] == null && right[i] == null) || left[i] != null && left[i].equals(right[i]));
      if (!result) {
        break;
      }
    }
  }
  return result;
}

}