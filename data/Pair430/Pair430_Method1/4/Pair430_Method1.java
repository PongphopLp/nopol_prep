import java.util.*;

public class Target {

boolean areContentsEqual(double[] array1,double[] array2){
  if ((array1 == null) && (array2 == null))   return true;
  if ((array1 == null) || (array2 == null))   return false;
  if (array1.length != array2.length)   return false;
  for (int i=0; i < array2.length; i++) {
    if (array1[i] != array2[i])     return false;
  }
  return true;
}
  boolean __target__(double[] array1,double[] array2){
  if ((array1 == null) && (array2 == null))   return true;
  if ((array1 != null) || (array2 == null))   return false;
  if (array1.length != array2.length)   return false;
  for (int i=0; i < array2.length; i++) {
    if (array1[i] != array2[i])     return false;
  }
  return true;
}

}