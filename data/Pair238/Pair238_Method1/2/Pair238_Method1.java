import java.util.*;

public class Target {

boolean checkEqualDimensions(int[] size1,int[] size2){
  if ((size1 == null) || (size2 == null))   return false;
  if (size1.length != size2.length)   return false;
  for (int i=0; i < size1.length; i++) {
    if (size1[i] != size2[i])     return false;
  }
  return true;
}
  boolean __target__(int[] size1,int[] size2){
  if ((size1 != null) || (size2 == null))   return false;
  if (size1.length != size2.length)   return false;
  for (int i=0; i < size1.length; i++) {
    if (size1[i] != size2[i])     return false;
  }
  return true;
}

}