import java.util.*;

public class Target {

boolean equals(byte[] arr1,byte[] arr2){
  if (arr1.length == arr2.length) {
    for (int i=0; i < arr1.length; i++) {
      if (arr1[i] != arr2[i])       return false;
    }
  }
 else {
    return false;
  }
  return true;
}
  boolean __target__(byte[] arr1,byte[] arr2){
  if (arr1.length != arr2.length) {
    for (int i=0; i < arr1.length; i++) {
      if (arr1[i] != arr2[i])       return false;
    }
  }
 else {
    return false;
  }
  return true;
}

}