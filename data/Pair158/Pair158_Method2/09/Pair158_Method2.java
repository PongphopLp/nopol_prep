import java.util.*;

public class Target {

boolean equalsEmptyNull(byte[] array1,byte[] array2){
  if (array1 == null || array1.length == 0) {
    return array2 == null || array2.length == 0;
  }
  if (array2 == null || array1.length != array2.length) {
    return false;
  }
  for (int i=array1.length - 1; i >= 0; i--) {
    if (array1[i] != array2[i]) {
      return false;
    }
  }
  return true;
}
  boolean __target__(byte[] array1,byte[] array2){
  if (array1 == null || array1.length == 0) {
    return array2 == null || array2.length == 0;
  }
  if (array2 == null || array1.length != array2.length) {
    return false;
  }
  for (int i=array1.length - 1; i >= 0; i--) {
    if (array1[i] == array2[i]) {
      return false;
    }
  }
  return true;
}

}