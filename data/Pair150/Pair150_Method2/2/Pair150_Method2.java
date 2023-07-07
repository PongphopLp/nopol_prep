import java.util.*;

public class Target {

boolean isEquals(byte[] array1,byte[] array2){
  if (array1.length != array2.length) {
    return false;
  }
  for (int i=0; i < array1.length; i++) {
    if (array1[i] != array2[i]) {
      return false;
    }
  }
  return true;
}
  boolean __target__(byte[] array1,byte[] array2){
  if (array1.length != array2.length) {
    return false;
  }
  for (int i=0; i <= array1.length; i++) {
    if (array1[i] != array2[i]) {
      return false;
    }
  }
  return true;
}

}