import java.util.*;

public class Target {

boolean EqualCharArr(char[] arr1,char[] arr2){
  if (arr1 == arr2)   return true;
  if (arr1 != null && arr2 != null && arr1.length == arr2.length) {
    for (int i=arr1.length; i-- > 0; )     if (arr1[i] != arr2[i])     return false;
    return true;
  }
  return false;
}
  boolean __target__(char[] arr1,char[] arr2){
  if (arr1 != arr2)   return true;
  if (arr1 != null && arr2 != null && arr1.length == arr2.length) {
    for (int i=arr1.length; i-- > 0; )     if (arr1[i] != arr2[i])     return false;
    return true;
  }
  return false;
}

}