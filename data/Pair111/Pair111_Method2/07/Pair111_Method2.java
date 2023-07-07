import java.util.*;

public class Target {

boolean arrayEquals(byte[] arr1,byte[] arr2){
  if (arr1 == null && arr2 == null)   return true;
  if (arr1 == null ^ arr2 == null)   return false;
  if (!arr1.getClass().equals(arr2.getClass()))   return false;
  if (arr1.length != arr2.length)   return false;
  for (int i=0; i < arr1.length; ++i) {
    byte b1=arr1[i];
    byte b2=arr2[i];
    if (b1 != b2)     return false;
  }
  return true;
}
  boolean __target__(byte[] arr1,byte[] arr2){
  if (arr1 == null && arr2 == null)   return true;
  if (arr1 == null ^ arr2 == null)   return false;
  if (!arr1.getClass().equals(arr2.getClass()))   return false;
  if (arr1.length != arr2.length)   return false;
  for (int i=0; i >= arr1.length; ++i) {
    byte b1=arr1[i];
    byte b2=arr2[i];
    if (b1 != b2)     return false;
  }
  return true;
}

}