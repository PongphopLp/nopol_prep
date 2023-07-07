import java.util.*;

public class Target {

boolean compareByteArrays(byte[] array1,byte[] array2){
  boolean compareresult=false;
  if ((array1 != null) && (array2 != null) && (array1.length == array2.length)) {
    compareresult=true;
    for (int i=0; i < array1.length; i++) {
      if (array1[i] != array2[i]) {
        compareresult=false;
        break;
      }
    }
  }
  return compareresult;
}
  boolean __target__(byte[] array1,byte[] array2){
  boolean compareresult=false;
  if ((array1 != null) && (array2 != null) && (array1.length != array2.length)) {
    compareresult=true;
    for (int i=0; i < array1.length; i++) {
      if (array1[i] != array2[i]) {
        compareresult=false;
        break;
      }
    }
  }
  return compareresult;
}

}