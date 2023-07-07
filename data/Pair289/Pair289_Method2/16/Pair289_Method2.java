import java.util.*;

public class Target {

int compare(byte[] left,byte[] right){
  if (null != left) {
    if (null == right) {
      return (1);
    }
 else {
      int leftLength=left.length;
      int rightLength=right.length;
      if (leftLength < rightLength) {
        return (-1);
      }
 else       if (leftLength > rightLength) {
        return (1);
      }
 else {
        for (int i=0; i < leftLength; ++i) {
          short leftSubI=(short)(left[i] & 0xff);
          short rightSubI=(short)(right[i] & 0xff);
          if (leftSubI < rightSubI) {
            return (-1);
          }
 else           if (leftSubI > rightSubI) {
            return (1);
          }
        }
      }
    }
  }
 else {
    if (null != right)     return (-1);
 else     return (0);
  }
  return (0);
}
  int __target__(byte[] left,byte[] right){
  if (null != left) {
    if (null == right) {
      return (1);
    }
 else {
      int leftLength=left.length;
      int rightLength=right.length;
      if (leftLength < rightLength) {
        return (1);
      }
 else       if (leftLength > rightLength) {
        return (1);
      }
 else {
        for (int i=0; i < leftLength; ++i) {
          short leftSubI=(short)(left[i] & 0xff);
          short rightSubI=(short)(right[i] & 0xff);
          if (leftSubI < rightSubI) {
            return (-1);
          }
 else           if (leftSubI > rightSubI) {
            return (1);
          }
        }
      }
    }
  }
 else {
    if (null != right)     return (-1);
 else     return (0);
  }
  return (0);
}

}