import java.util.*;

public class Target {

boolean arraysAreEqual(byte[] array1,byte[] array2){
  if (array1.length != array2.length) {
    return false;
  }
  int len=array1.length;
  for (int i=0; i < len; i++) {
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
  int len=array1.length;
  for (int i=0; i <= len; i++) {
    if (array1[i] != array2[i]) {
      return false;
    }
  }
  return true;
}

}