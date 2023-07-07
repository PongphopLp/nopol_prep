import java.util.*;

public class Target {

boolean stringArrayCompare(String[] arr1,String[] arr2){
  if (arr1 == null && arr2 == null) {
    return true;
  }
  if (arr1 == null || arr2 == null || arr1.length != arr2.length) {
    return false;
  }
  for (int i=0; i < arr1.length; i++) {
    if (!arr1[i].equals(arr2[i])) {
      return false;
    }
  }
  return true;
}
  boolean __target__(String[] arr1,String[] arr2){
  if (arr1 == null && arr2 == null) {
    return true;
  }
  if (arr1 == null || arr2 == null || arr1.length == arr2.length) {
    return false;
  }
  for (int i=0; i < arr1.length; i++) {
    if (!arr1[i].equals(arr2[i])) {
      return false;
    }
  }
  return true;
}

}