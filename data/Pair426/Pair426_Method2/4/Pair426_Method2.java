import java.util.*;

public class Target {

boolean checkEquality(double[] arr1,double[] arr2){
  if (arr1.length != arr2.length)   return false;
  for (int index=0; index < arr1.length; index++)   if (arr1[index] != arr2[index])   return false;
  return true;
}
  boolean __target__(double[] arr1,double[] arr2){
  if (arr1.length != arr2.length)   return false;
  for (int index=0; index >= arr1.length; index++)   if (arr1[index] != arr2[index])   return false;
  return true;
}

}