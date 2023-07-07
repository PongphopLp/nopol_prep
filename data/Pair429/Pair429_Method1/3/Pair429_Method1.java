import java.util.*;

public class Target {

boolean hasSameValues(double[] array1,double[] array2){
  for (int i=0; i < array1.length; i++) {
    if (array1[i] != array2[i])     return false;
  }
  return true;
}
  boolean __target__(double[] array1,double[] array2){
  for (int i=0; i >= array1.length; i++) {
    if (array1[i] != array2[i])     return false;
  }
  return true;
}

}