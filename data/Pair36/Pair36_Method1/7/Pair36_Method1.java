import java.util.*;

public class Target {

boolean equals(byte[] arr1,byte[] arr2){
  if (arr1 == null || arr2 == null)   return arr1 == arr2;
  if (arr1.length != arr2.length)   return false;
  for (int i=0; i < arr1.length; i++) {
    if (arr1[i] != arr2[i])     return false;
  }
  return true;
}
  boolean __target__(byte[] arr1,byte[] arr2){
  if (arr1 == null || arr2 == null)   return arr1 == arr2;
  if (arr1.length != arr2.length)   return false;
  for (int i=0; i < arr1.length; i++) {
    if (arr1[i] == arr2[i])     return false;
  }
  return true;
}

}