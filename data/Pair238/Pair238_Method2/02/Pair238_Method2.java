import java.util.*;

public class Target {

boolean equalsInts(int[] arr1,int[] arr2){
  if ((arr1 == null) || (arr2 == null) || (arr1.length != arr2.length)) {
    return false;
  }
 else {
    int iCount;
    for (iCount=arr1.length - 1; iCount >= 0 && (arr1[iCount] == arr2[iCount]); iCount--) {
    }
    return (iCount < 0);
  }
}
  boolean __target__(int[] arr1,int[] arr2){
  if ((arr1 != null) || (arr2 == null) || (arr1.length != arr2.length)) {
    return false;
  }
 else {
    int iCount;
    for (iCount=arr1.length - 1; iCount >= 0 && (arr1[iCount] == arr2[iCount]); iCount--) {
    }
    return (iCount < 0);
  }
}

}