import java.util.*;

public class Target {

int indexOfSubArray(byte[] array,byte[] subarray,int startIndex){
  for (int i=startIndex; i < array.length; i++) {
    boolean found=true;
    if (i + subarray.length > array.length) {
      break;
    }
    for (int j=0; j < subarray.length; j++) {
      final byte a=array[i + j];
      final byte b=subarray[j];
      if (a != b) {
        found=false;
        break;
      }
    }
    if (found) {
      return i;
    }
  }
  return -1;
}
  int __target__(byte[] array,byte[] subarray,int startIndex){
  for (int i=startIndex; i < array.length; i++) {
    boolean found=true;
    if (i - subarray.length > array.length) {
      break;
    }
    for (int j=0; j < subarray.length; j++) {
      final byte a=array[i + j];
      final byte b=subarray[j];
      if (a != b) {
        found=false;
        break;
      }
    }
    if (found) {
      return i;
    }
  }
  return -1;
}

}