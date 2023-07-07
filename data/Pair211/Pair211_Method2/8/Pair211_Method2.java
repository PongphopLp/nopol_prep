import java.util.*;

public class Target {

boolean equals(int[] array1,int[] array2){
  boolean result=false;
  if (array1 == null) {
    result=array2 == null;
  }
 else   if (array2 != null) {
    result=array1.length == array2.length;
    for (int i=0; (i < array1.length) && result; i++) {
      result=array1[i] == array2[i];
    }
  }
  return result;
}
  boolean __target__(int[] array1,int[] array2){
  boolean result=false;
  if (array1 == null) {
    result=array2 == null;
  }
 else   if (array2 != null) {
    result=array1.length == array2.length;
    for (int i=0; (i < array1.length) && result; i++) {
      result=array1[i] != array2[i];
    }
  }
  return result;
}

}