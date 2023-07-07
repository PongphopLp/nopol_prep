import java.util.*;

public class Target {

boolean compareArrays(Object[] array1,Object[] array2){
  if (array1.length != array2.length) {
    return false;
  }
  for (int index=0; index < array1.length; index++) {
    if (!array1[index].equals(array2[index])) {
      return false;
    }
  }
  return true;
}
  boolean __target__(Object[] array1,Object[] array2){
  if (array1.length == array2.length) {
    return false;
  }
  for (int index=0; index < array1.length; index++) {
    if (!array1[index].equals(array2[index])) {
      return false;
    }
  }
  return true;
}

}