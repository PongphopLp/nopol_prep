import java.util.*;

public class Target {

int arrayIndexOf(byte[] array,byte[] subsequence,int fromIndex){
  if (subsequence.length == 0)   return 0;
 else {
    int j;
    int stop=(array.length - subsequence.length) + 1;
    while (fromIndex < stop) {
      if (array[fromIndex] == subsequence[0]) {
        j=1;
        while (j < subsequence.length) {
          if (array[fromIndex + j] == subsequence[j])           j++;
 else           break;
        }
        if (j == subsequence.length)         return fromIndex;
      }
      fromIndex++;
    }
    return -1;
  }
}
  int __target__(byte[] array,byte[] subsequence,int fromIndex){
  if (subsequence.length == 0)   return 0;
 else {
    int j;
    int stop=(array.length - subsequence.length) + 1;
    while (fromIndex < stop) {
      if (array[fromIndex] == subsequence[0]) {
        j=1;
        while (j <= subsequence.length) {
          if (array[fromIndex + j] == subsequence[j])           j++;
 else           break;
        }
        if (j == subsequence.length)         return fromIndex;
      }
      fromIndex++;
    }
    return -1;
  }
}

}